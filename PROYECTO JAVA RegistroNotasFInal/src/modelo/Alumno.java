/*  
Proyecto Curso Java 01
Profesor: Gustavo Coronel Castillo
Alumnos:
   - Omar Rosadio
   - Jefferson Rivera
*/


package modelo;

public class Alumno {
    private String nombre;
    private String codigo;
    private float exParcial;
    private float practica1;
    private float practica2;
    private float practica3;
    private float exFinal;
    private float promedio;

    public Alumno(String nombre,String codigo, float exParcial, float practica1, float practica2, float practica3, float exFinal) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.exParcial = exParcial;
        this.practica1 = practica1;
        this.practica2 = practica2;
        this.practica3 = practica3;
        this.exFinal = exFinal;
        promedio = exParcial + ((practica1+practica2+practica3)/3) + exFinal;
        promedio = promedio/3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getExParcial() {
        return exParcial;
    }

    public void setExParcial(float exParcial) {
        this.exParcial = exParcial;
    }

    public float getPractica1() {
        return practica1;
    }

    public void setPractica1(float practica1) {
        this.practica1 = practica1;
    }

    public float getPractica2() {
        return practica2;
    }

    public void setPractica2(float practica2) {
        this.practica2 = practica2;
    }

    public float getPractica3() {
        return practica3;
    }

    public void setPractica3(float practica3) {
        this.practica3 = practica3;
    }

    public float getExFinal() {
        return exFinal;
    }

    public void setExFinal(float exFinal) {
        this.exFinal = exFinal;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    
    
    
    
    
    
}
