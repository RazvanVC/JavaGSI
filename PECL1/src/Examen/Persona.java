/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author razvanvc
 */
public class Persona {
    
    //Atributos
    private String nombre;
    private String nif;
    
    //Constructor

    public Persona(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }
    
    
    //Metodos

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nif=" + nif + '}';
    }
    
    
}
