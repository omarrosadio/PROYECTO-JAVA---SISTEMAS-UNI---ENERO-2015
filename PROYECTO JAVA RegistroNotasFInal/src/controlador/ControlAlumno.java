/*  
Proyecto Curso Java 01
Profesor: Gustavo Coronel Castillo
Alumnos:
   - Omar Rosadio
   - Jefferson Rivera
*/


package controlador;

import java.util.ArrayList;
import modelo.Alumno;


public class ControlAlumno {
    private ArrayList<Alumno> alumnos;
    
    public ControlAlumno(){
      alumnos = new ArrayList<>();
    }
    

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }   
        
    public Alumno buscarAlumno(String codigo){
      for(Alumno a : alumnos){
        if(a.getCodigo().equals(codigo)){
          return a;
        }
      }
      return null;
    }
    
    private int getIndice(String codigo){
      int indice = -1;
      int i=0;
      for(Alumno a :alumnos){
        if(a.getCodigo().equals(codigo)){
          indice = i;
        }
        i++;
      }
      return indice;
    }
    
    public void eliminarAlumno(String codigo){
       int indice = getIndice(codigo);
       alumnos.remove(indice);
    }
    
    public void agregarAlumno(Alumno a){
      alumnos.add(a);
    }
    
}
