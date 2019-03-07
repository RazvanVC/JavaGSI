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
public class Empresa {
    
    //Atributos
    private String cif;
    private String nombre;
    
    //Constructor
    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
    }
    
    //Métodos
    
    //Get
    
    public String getNombre() {
        return nombre;
    }
    public String getCif() {
        return cif;
    }
    
    //Set
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public String toString() {
        return "Empresa{" + "Nombre=" + nombre + ", CIF=" + cif + '}';
    }    
        
}
