package Entidades;

import java.time.LocalDate;

public class Alumno {

    private int idAlumno;
    private String apellido;
    private String nombre;
    private LocalDate fechadenacimiento;
    private boolean estado;

    public Alumno() {
    }

    public Alumno(String apellido, String nombre, LocalDate fechadenacimiento, boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechadenacimiento = fechadenacimiento;
        this.estado = estado;
    }

    public Alumno(int idAlumno, String apellido, String nombre, LocalDate fechadenacimiento, boolean estado) {
        this.idAlumno = idAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechadenacimiento = fechadenacimiento;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(LocalDate fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno id:" + idAlumno + ", Apellido:" + apellido + ", Nombre:" + nombre + ", Fecha de nacimiento:" + fechadenacimiento + ", Estado:" + estado;
    }

}
