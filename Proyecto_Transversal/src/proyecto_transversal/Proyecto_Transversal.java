package proyecto_transversal;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
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
      
//        for (Alumno alumno: alu.listarAlumnos()) {
//            
//            System.out.println(alumno.toString());
//            
//        }
      
MateriaData md = new MateriaData();

        //insertar materias
       
//        Materia mat = new Materia("Matematicas", 2024, false);
//        Materia lab = new Materia("Laboratorio de Programacion", 2024, true);
//        Materia eda = new Materia("Estructura de Datos", 2024, false);
//        Materia web = new Materia("Programacion WEB", 2024, true);
//        Materia ing = new Materia("Ingles", 2024, false);
//        
//        md.guardarMateria(mat);
//        md.guardarMateria(lab);
//        md.guardarMateria(eda);
//        md.guardarMateria(web);
//        md.guardarMateria(ing);  
        
        //modificar materias
        
//        Materia mat = new Materia(1,"Matematicas", 2024, true);
//        Materia lab = new Materia(3,"Estructura de datos (EDA)", 2024, true);
//        Materia eda = new Materia(5,"Ingles", 2024, true);
//        
//        md.modificarMateria(mat);
//        md.modificarMateria(lab);
//        md.modificarMateria(eda);
//        
        //buscar materias
        
//        Materia materiaEncontrada = md.buscarMateria(1);
//        System.out.println(materiaEncontrada.toString());
//        materiaEncontrada = md.buscarMateria(5);
//        System.out.println(materiaEncontrada.toString());

        //eliminar materia
        
//        md.eliminarMateria(5);

        //listar materias
        
//        for (Materia materia: md.listarMaterias()) {
//            
//            System.out.println(materia.toString());
//            
//        }

        InscripcionData id = new InscripcionData();

        // guardar inscripcion a materia
        
//        Alumno pedro = alu.buscarAlumnoID(3);
//        Alumno luis = alu.buscarAlumnoID(7);
//        Alumno maria = alu.buscarAlumnoID(2);
//        Materia mate = md.buscarMateria(2);
//        Inscripcion insc;
//        insc = new Inscripcion(pedro, mate, 9);
//        id.guardarInscripcion(insc);
//        insc = new Inscripcion(luis, mate, 6);
//        id.guardarInscripcion(insc);
//        insc = new Inscripcion(maria, mate, 7);
//        id.guardarInscripcion(insc);
        
        //actualizar notas
//        id.actualizarNota(7,2,7);
//        id.actualizarNota(3, 2, 9);
        
        //borrar inscripcion
//        id.borrarInscripcionMateriaAlumno(2, 2);
        
        // obtener inscripciones
        
//        for (Inscripcion inscrip: id.obtenerInscripciones()) {
//            System.out.println("ID Inscripto " + inscrip.getIdInscripcion());
//            System.out.println("Apellido " + inscrip.getIdAlumno().getApellido());
//            System.out.println("Nombre " + inscrip.getIdAlumno().getNombre());
//            System.out.println("Materia " + inscrip.getIdMateria().getNombre());
//        }
      
        //obtener inscripciones por alumno
       
//        for (Inscripcion inscrip: id.obtenerInscripcionesPorAlumno(7)) {
//            System.out.println("ID Inscripto " + inscrip.getIdInscripcion());
//            System.out.println("Apellido " + inscrip.getIdAlumno().getApellido());
//            System.out.println("Nombre " + inscrip.getIdAlumno().getNombre());
//            System.out.println("Materia " + inscrip.getIdMateria().getNombre());
//        }

        // obtener materias cursadas
       
//        for (Materia mat: id.obtenerMateriasCursadas(3)) {
//            System.out.println("Materia " + mat.getNombre());
//            System.out.println("Año "+ mat.getAño());
//            
//            
//        }
      
       //obtener materias no cursadas
//       
//       for (Materia mat: id.obtenerMateriasNoCursadas(3)) {
//            System.out.println("Materia " + mat.getNombre());
//            System.out.println("Año "+ mat.getAño());
//   
//        }

        //listar alumnos por materia
        
//        for (Alumno al: id.obtenerAlumnosPorMateria(2)) {
//            System.out.println(al.toString());
//       }

    }
    
}
