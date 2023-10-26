/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Crea la clase Empleado con la siguiente información: un nombre, un apellido, 
 * un sueldo y una clave que tendrá por defecto el valor “patata”. Crea una clase
 * con los atributos necesarios para almacenar los datos de cada empleado y los 
 * métodos constructores, getters y setters. La clase Empleado debe poder 
 * serializarse, excepto el atributo que guarda la clave.

 * @author Miguel de la Rubia
 */
import java.io.Serializable;//importamos la interfaz Serializable
import java.util.Objects;

public class Empleado implements Serializable {  //implementamos la interfaz Serializable 
   //atributos de la clase
   
    private String nombre;
    private String apellido;
    private double sueldo;
    transient private  String clave = "patata";//no se puede poner en el constructor al 
    //tener un valor por defecto
    //Este atributo no será Serializado por eso escribimos "transient"
    
    //Constructor vacio
        public Empleado(){
        }
        
    //Constructor de la clase sin la clave predefinida
     public Empleado(String nombre, String apellido, double sueldo, String clave) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.clave =clave;
    }   
    //Constructor con la clave predefinida 
     public Empleado (String nombre, String apellido, double sueldo){
     
         this.nombre = nombre;
         this.apellido = apellido;
         this.sueldo = sueldo;
         
     }

  
    
    //GETTERS & SETTERS
     
     public String getNombre(){
         return nombre;
     }
     
     public String getApellido(){
         return apellido;
     }
     
     public double getSueldo(){
         return sueldo;
     }
     
     public String getClave(){
         return clave;
     }
     
     public void setNombre(String nombre){
         this.nombre= nombre;
     }
     
     public void setApellido(String apellido){
         this.apellido=apellido;
     }
     
     public void setSueldo(double sueldo){
         this.sueldo=sueldo;
     }
     
     
     public void setClave(String clave){
         this.clave=clave;
     }
     
     
     //IMPLEMENTACION al método toString(). 
     
     @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + ", clave=" + clave + '}';
    }
    
    //HashCode y eqquals para saber en funcion del nombre y el apellido si hay varios empleados iguales
      @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.apellido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    } 
     
   
    
}
