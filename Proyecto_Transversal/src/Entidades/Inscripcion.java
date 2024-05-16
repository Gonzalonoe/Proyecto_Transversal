

package Entidades;


public class Inscripcion {
    private int idInscripcion;
    private Alumno alumno;
    private Materia materia;
    private double nota;
    
    public Inscripcion(){
    }

    public Inscripcion(int idIncripcion, Alumno alumno, Materia materia, double nota) {
        this.idInscripcion = idIncripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getIdIncripcion() {
        return idInscripcion;
    }

    public void setIdIncripcion(int idIncripcion) {
        this.idInscripcion = idIncripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String insc=idInscripcion+" "+alumno.getApellido()+" "+alumno.getNombre()+" "+materia.getNombre();
        return insc;
    }
    
    
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
