/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

/**
 *
 * @author razvanvc
 */
public class Persona {
    
    //Atributos
    protected String DNI;
    protected int edad;
    protected String estado;
    protected String nombre;
        
    //Constructor
    public Persona(String nombre,String DNI, int edad, String estado) {
        this.DNI = DNI;
        this.edad = edad;
        this.estado = estado;
        this.nombre = nombre;
    }
    
    //Metodos
    
    //Get
    public String getNombre() {
        return nombre;
    }
    public String getEstado() {
        return estado;
    }
    public int getEdad() {
        return edad;
    }
    public String getDNI() {
        return DNI;
    }

    //Set
    
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Extra
    
    public void cumpleaños (){
        edad++;
    }

    @Override
    public String toString() {
        return "Persona{ dni: " + DNI + ", nombre: " + nombre + ", edad: " + ", estado: " + estado; //To change body of generated methods, choose Tools | Templates.
    }
    
}