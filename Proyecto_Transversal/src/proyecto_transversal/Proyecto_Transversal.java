package proyecto_transversal;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import Entidades.Alumno;
import java.sql.Connection;

public class Proyecto_Transversal {

    public static void main(String[] args) {


        AlumnoData alu = new AlumnoData();
       
        //insertar alumnos
        
//        Alumno juan = new Alumno(37267487, "Flores", "Juan", LocalDate.of(1980, 4, 10), true);
//        Alumno maria = new Alumno(37267488, "Garcia", "Maria", LocalDate.of(1981, 5, 15), true);
//        Alumno pedro = new Alumno(37267489, "Lopez", "Pedro", LocalDate.of(1982, 6, 20), true);
//        Alumno ana = new Alumno(37267490, "Martinez", "Ana", LocalDate.of(1983, 7, 25), true);
//        Alumno carlos = new Alumno(37267491, "Rodriguez", "Carlos", LocalDate.of(1984, 8, 30), true);
//        Alumno laura = new Alumno(37267492, "Sanchez", "Laura", LocalDate.of(1985, 9, 5), true);
//        Alumno luis = new Alumno(37267493, "Perez", "Luis", LocalDate.of(1986, 10, 10), true);
//        Alumno sofia = new Alumno(37267494, "Fernandez", "Sofia", LocalDate.of(1987, 11, 15), true);
//        Alumno lucia = new Alumno(37267495, "Gomez", "Lucia", LocalDate.of(1988, 12, 20), true);
//        Alumno diego = new Alumno(37267496, "Diaz", "Diego", LocalDate.of(1989, 1, 25), true);
//        
//        alu.guardarAlumno(juan);
//        alu.guardarAlumno(maria);
//        alu.guardarAlumno(pedro);
//        alu.guardarAlumno(ana);
//        alu.guardarAlumno(carlos);
//        alu.guardarAlumno(laura);
//        alu.guardarAlumno(luis);
//        alu.guardarAlumno(sofia);
//        alu.guardarAlumno(lucia);
//        alu.guardarAlumno(diego);

       //modificar alumnos
       
//        Alumno juan = new Alumno(1,37267487, "Flores", "Juan Manuel", LocalDate.of(1980, 4, 10), true);
//        Alumno maria = new Alumno(2,37267488, "Garcia", "Maria Laura", LocalDate.of(1981, 5, 15), true);
//        Alumno pedro = new Alumno(3,37267489, "Lopez", "Pedro Alfonso", LocalDate.of(1982, 6, 20), true);
//        alu.modificarAlumno(juan);
//        alu.modificarAlumno(maria);
//        alu.modificarAlumno(pedro);
        
        //elminar alumnos
        
//        alu.eliminarAlumno(10);
//        alu.eliminarAlumno(9);
//        alu.eliminarAlumno(8);
       
        //buscar alumno por id activo
        
//        Alumno alumnoEncontrado = alu.buscarAlumnoID(5);
//        
//        if (alumnoEncontrado!=null) {
//            System.out.println(alumnoEncontrado.toString());
//        }

        //buscar alumno por id inactivo
        
//        Alumno alumnoEncontrado = alu.buscarAlumnoID(9);
//        
//        if (alumnoEncontrado!=null) {
//            System.out.println(alumnoEncontrado.toString());
//        }

        //buscar alumno por dni estado activo
        
//        Alumno alumnoEncontrado= alu.buscarAlumnoDNI(37267492);
//        
//        if (alumnoEncontrado!=null) {
//            System.out.println(alumnoEncontrado.toString());
//        }
        
        //buscar alumno por dni estado inactivo
        
//        Alumno alumnoEncontrado= alu.buscarAlumnoDNI(37267496);
//        
//        if (alumnoEncontrado!=null) {
//            System.out.println(alumnoEncontrado.toString());
//        }
        
     
        //listar alumnos
      
        for (Alumno alumno: alu.listarAlumnos()) {
            
            System.out.println(alumno.toString());
            
        }
        
        
    }

}
