/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;



import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.*;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.export.Prepare;
import org.mariadb.jdbc.util.PrepareResult;

/**
 *
 * @author emanu
 */
public class InscripcionData {
    
    private Connection con = null;
    private MateriaData md = new MateriaData();
    private AlumnoData ad = new AlumnoData();
    

    public InscripcionData() {
        
        this.con = (Connection) Conexion.getConnection();
      
    }
    
    public void guardarInscripcion(Inscripcion insc){
        
        String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES (?,?,?);";
        
        try {
           
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getIdAlumno().getIdAlumno());
            ps.setInt(3, insc.getIdMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion generada con exito");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota ){
        
        String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria=? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
            int filas = ps.executeUpdate();
            
            if (filas==1) {
                JOptionPane.showMessageDialog(null, "Nota actualizada con exito");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        } 
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno,int idMateria){
     
        String sql= "DELETE from inscripcion WHERE idAlumno=? AND idMateria=?";
        
        try {
           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int filas = ps.executeUpdate();
            
            if (filas==1) {
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada con exito");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        
          ArrayList<Inscripcion> cursadas = new ArrayList<>();
            
            String sql="SELECT * FROM inscripcion ";

        try {
          
            PreparedStatement ps = con.prepareStatement(sql);
           
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu = ad.buscarAlumnoID(rs.getInt("idAlumno"));
                insc.setIdAlumno(alu);
                Materia m = (Materia) md.buscarMateria(rs.getInt("idMateria"));
                insc.setIdMateria(m);
                insc.setNota(rs.getDouble("nota"));
                
                cursadas.add(insc);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        
        return cursadas;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        
          ArrayList<Inscripcion> cursadas = new ArrayList<>();
            
            String sql="SELECT * FROM inscripcion WHERE idAlumno = ? ";

        try {
          
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu = ad.buscarAlumnoID(rs.getInt("idAlumno"));
                insc.setIdAlumno(alu);
                Materia m = (Materia) md.buscarMateria(rs.getInt("idMateria"));
                insc.setIdMateria(m);
                insc.setNota(rs.getDouble("nota"));
                
                cursadas.add(insc);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        
        return cursadas;
    }
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
       
        ArrayList<Materia> cursadas = new ArrayList<>();
            
            String sql="SELECT inscripcion.idMateria, nombre ,año "
                    + "FROM inscripcion,materia"
                    + " WHERE inscripcion.idMateria = materia.idMateria"
                    + "AND inscripcion.idAlumno = ? ";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            ResultSet rs =ps.executeQuery();
            
           while (rs.next()) {
                
                Materia mat = new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAño(rs.getInt("año"));
                
                cursadas.add(mat);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return cursadas;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int idAlumno){
         ArrayList<Materia> noCursadas = new ArrayList<>();
            
            String sql="SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
                    + "(SELECT idMateria FROM inscripcion WHERE idAlumno=?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Materia mat = new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAño(rs.getInt("año"));
                
                noCursadas.add(mat);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
            
            
            return noCursadas;
    }
    
    public List<Alumno> obtenerAlumnosPorMateria(int idMateria){
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
            
            String sql="SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado "
                    + "FROM iscripcion i, alumno a WHERE a.idAlumno = a.idAlumno AND idMateria = ? "
                    + "AND estado=1;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Alumno al = new Alumno();
                al.setIdAlumno(rs.getInt("idAlumno"));
                al.setIdAlumno(rs.getInt("dni"));
                al.setNombre(rs.getString("nombre"));
                al.setApellido(rs.getString("apellido"));
                al.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                al.setEstado(rs.getBoolean("estado"));
                
                alumnos.add(al);
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        
        return alumnos;
    }

    
}
