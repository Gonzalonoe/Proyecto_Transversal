/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;




import Entidades.Materia;
import java.sql.Date;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

public class MateriaData {
    
    Connection con;
    
    public MateriaData() {
        
        con = (Connection) Conexion.getConnection();
        
    }
    
    public void guardarMateria(Materia materia){
        
        String sql = "INSERT INTO materia (nombre, año, estado)"
                    + " VALUES (?,?,?)";
        
        try {

            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia insertada");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }
    
    public Materia buscarMateria(int idMateria){
        
        String sql="SELECT nombre,año,estado FROM materia WHERE idMateria=? AND estado=1 ";
        Materia mat = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                mat = new Materia();
                mat.setIdMateria(idMateria);
                mat.setNombre(rs.getString("nombre"));
                mat.setAño(rs.getInt("año"));
                mat.setEstado(rs.getBoolean("estado"));
                
                
            }else{
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return mat;
    }
    
    public void modificarMateria(Materia materia){
         
        String sql = "UPDATE materia SET nombre=?,año = ?,estado = ? WHERE idMateria =?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4,materia.getIdMateria());
            
            int registro= ps.executeUpdate();
            
            if (registro==1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }
    
    public void eliminarMateria(int id){
       
        String sql = "UPDATE materia SET estado=0 WHERE idMateria=? ";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
           int registro= ps.executeUpdate();
            
            if (registro==1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada");
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }
    
    public List<Materia> listarMaterias(){
       
        String sql="SELECT idMateria,nombre,año FROM materia WHERE estado=1 ";
        ArrayList<Materia> materias = new ArrayList<>();

        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Materia mate = new Materia();
                mate.setIdMateria(rs.getInt("idMateria"));
                mate.setNombre(rs.getString("nombre"));
                mate.setAño(rs.getInt("año"));
                mate.setEstado(true);
                
                materias.add(mate);
            } 
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    
        return materias;
    }
}
