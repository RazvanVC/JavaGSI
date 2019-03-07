/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aparcamiento;

import java.util.ArrayList;

/**
 *
 * @author razvanvc
 */
public class Aparcamiento {
    
    //Atributos
    private ArrayList<Vehiculo> vehiculos;    
    private int capacidad;
    
    //Constructor

    public Aparcamiento(int capacidad,ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
        this.capacidad = capacidad;
    }

    
    //Metodos
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    
    public ArrayList getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList vehiculos) {
        this.vehiculos = vehiculos;
    }

    
    public void introducirVehiculo (Vehiculo v){
        if (this.capacidad > 0){
            this.vehiculos.add(v);
            this.capacidad --;
        }
        else System.out.println("No hay capacidad");
    }
    
    public double sacarVehiculo (Vehiculo v){
        double importe = 0;
        if (vehiculos.contains(v)){
            this.vehiculos.remove(v);
            this.capacidad ++;
            importe = v.calcularImporte();
        }
        else { System.out.println("El coche no esta en el aparcamiento");
        }
        return importe;
    }
    
    public double sacarVehiculo (String matricula){
        double importe = 0;
        boolean encontrado = false;
        int i=0;
        while (i<this.vehiculos.size()-1 || !encontrado){
            
            Vehiculo v1;
            v1 = vehiculos.get(i);
            if (v1.getMatricula() == matricula) {
                this.vehiculos.remove(v1);
                this.capacidad ++;
                importe = v1.calcularImporte();
                encontrado = true;
       
            }
            i++;
        }
        if (!encontrado) System.out.println("Vehiculo no encontrado");
        
        return importe;
    }
    
}
