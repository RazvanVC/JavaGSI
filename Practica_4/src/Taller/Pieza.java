/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

/**
 *
 * @author razvanvc
 */
public class Pieza {
    
    //Atrbutos
    private String nombre;
    private double precio;

    //Constructor
    public Pieza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Metodos
    
    //Get
    public double getPrecio() {
        return precio;
    }
    public String getNombre() {
        return nombre;
    }

    //Set
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
}
