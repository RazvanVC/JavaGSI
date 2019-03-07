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
public class PruebaTaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creacion de Talleres
        Taller t1 = new Taller ("Taller1","911234567",12.2);
        Taller t2 = new Taller ("Taller2","918912345",15.7);
        
        //Creacion de piezas
        Pieza p1 = new Pieza("Cabezal",97.99);
        Pieza p2 = new Pieza("Cigueñal",120.23);
        Pieza p3 = new Pieza("Volante",60.3);
        Pieza p4 = new Pieza("Parachoques",157.34);
        ArrayList <Pieza> Piezasv1 = new ArrayList <>();
        ArrayList <Pieza> Piezasv2 = new ArrayList <>();
        Piezasv1.add(p1);
        Piezasv1.add(p2);
        Piezasv1.add(p3);
        Piezasv2.add(p2);
        Piezasv2.add(p3);
        Piezasv2.add(p4);
        
        //Creacion de vehiculos
        Vehiculo v1 = new Vehiculo ("1234ZVW","Toyota","Auris",Piezasv1);
        Vehiculo v2 = new Vehiculo ("1267XVW","Seat","Leon",Piezasv2);
        
        
        //Obtencion del precio de cada reparacion en los distintos talleres
        double preciov1 = t1.repararVehiculo(v1, 17);
        double preciov2 = t2.repararVehiculo(v2, 15);
        
        System.out.println(preciov1);
        System.out.println(preciov2);
    }
    
}