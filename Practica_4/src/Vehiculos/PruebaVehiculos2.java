/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author razvanvc
 */
public class PruebaVehiculos2 {

    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("1234 BCD", "Opel", "Astra", 0, false);
        Vehiculo v2 = new Vehiculo("2345 CDE", "BMW", "S1");
        Vehiculo v3 = new Vehiculo("3456 DEF", "Audi", "A3", 5);
        
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
    }
    
}