/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

import java.util.ArrayList;

/**
 *
 * @author razvanvc
 */
public class Taller {
    
    //Atributos
    private String nombre;
    private String telefono;
    private double precioHora;

    //Constructor

    public Taller(String nombre, String telefono, double precioHora) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.precioHora = precioHora;
    }
    
    
    //Metodos
    
    //Get
    public double getPrecioHora() {
        return precioHora;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getNombre() {
        return nombre;
    }
    
    //Set
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Extra
    public double repararVehiculo (Vehiculo vehiculo, int horas){
        
        ArrayList <Pieza> listapiezas;
        listapiezas = vehiculo.getPiezas();
        double total = 0 + (precioHora*horas);
        for (int i = 0; i<listapiezas.size(); i++){
            Pieza Pieza1 = listapiezas.get(i);
            total += Pieza1.getPrecio();
        }
        return total;
    }
}