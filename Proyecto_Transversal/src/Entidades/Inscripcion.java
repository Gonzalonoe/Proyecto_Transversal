

package Entidades;


public class Inscripcion {
    private int idInscripcion;
    private Alumno idAlumno;
    private Materia idMateria;
    private double nota;
    
    public Inscripcion(){
    }

    public Inscripcion(int idIncripcion, Alumno alumno, Materia materia, double nota) {
        this.idInscripcion = idIncripcion;
        this.idAlumno = alumno;
        this.idMateria = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.idAlumno = alumno;
        this.idMateria = materia;
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idIncripcion) {
        this.idInscripcion = idIncripcion;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno alumno) {
        this.idAlumno = alumno;
    }

    public Materia getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materia materia) {
        this.idMateria = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String insc=idInscripcion+" "+idAlumno.getApellido()+" "+idAlumno.getNombre()+" "+idMateria.getNombre();
        return insc;
    }
    
    
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
