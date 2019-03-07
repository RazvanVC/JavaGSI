/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aparcamiento;

import static java.lang.Thread.sleep;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author razvanvc
 */
public class PruebaAparcamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        LocalTime ta7 = LocalTime.of(8, 23);
        LocalTime ta8 = LocalTime.of(10, 34);
        LocalTime tc9 = LocalTime.of(7, 23);
        LocalTime tc10 = LocalTime.of(4, 12);
        //Aparcamiento
        
        
        //Crear Vehiculos
        //Automovil
        Automovil a1 = new Automovil ("1234XCV",true,"todoterreno");//String matricula, boolean abono,String tipo
        Automovil a2 = new Automovil ("2345DFG",true,"turismo");
        Automovil a3 = new Automovil ("2836JGY",true,"furgoneta");
        Automovil a4 = new Automovil ("4093GDT",false,"todoterreno");
        Automovil a5 = new Automovil ("1207HYT",false,"turismo");
        Automovil a6 = new Automovil ("1287UTY",false,"furgoneta");
        Automovil a7 = new Automovil ("1234XCV",ta7,true,"todoterreno");//String matricula, LocalTime fecha, boolean abono,String tipo
        Automovil a8 = new Automovil ("1234XOV",ta7,false,"todoterreno");
        
        //Camion
        Camion c1 = new Camion("2345HTD", true, 1);//String matricula, boolean abono,int nejes
        Camion c2 = new Camion("0923JHF", true, 2);
        Camion c3 = new Camion("9823TUO", true, 4);
        Camion c4 = new Camion("1231YAO", true, 6);
        Camion c5 = new Camion("2910UAT", false, 1);
        Camion c6 = new Camion("0912JAO", false, 2);
        Camion c7 = new Camion("0124SET", false, 4);
        Camion c8 = new Camion("1245LET", false, 6);
        Camion c9 = new Camion("2947OT",tc9, true, 1);//String matricula, LocalTime fecha, boolean abono,int nejes
        Camion c10 = new Camion("2947OT",tc10, true, 7);
        Camion c11 = new Camion("2947OT",tc9, false, 2);
        Camion c12 = new Camion("0912YTS",tc10, false, 10);
        
        ArrayList <Vehiculo> coches = new ArrayList<>();
        //Aparcamiento
        Aparcamiento ap1 = new Aparcamiento (150,coches);
        
        //Introducimos coches
        ap1.introducirVehiculo(a1);
        ap1.introducirVehiculo(a2);
        ap1.introducirVehiculo(a3);
        ap1.introducirVehiculo(a4);
        ap1.introducirVehiculo(a5);
        ap1.introducirVehiculo(a6);
        ap1.introducirVehiculo(a7);
        ap1.introducirVehiculo(a8);
        
        //Introducimos camiones
        ap1.introducirVehiculo(c1);
        ap1.introducirVehiculo(c2);
        ap1.introducirVehiculo(c3);
        ap1.introducirVehiculo(c4);
        ap1.introducirVehiculo(c5);
        ap1.introducirVehiculo(c6);
        ap1.introducirVehiculo(c7);
        ap1.introducirVehiculo(c8);
        ap1.introducirVehiculo(c9);
        ap1.introducirVehiculo(c10);
        ap1.introducirVehiculo(c11);
        ap1.introducirVehiculo(c12);
        

        System.out.println(ap1.sacarVehiculo(a7));

        System.out.println(ap1.sacarVehiculo("1234XCV"));

        System.out.println(ap1.sacarVehiculo(c9));

        System.out.println(ap1.sacarVehiculo(c12));

        System.out.println(ap1.sacarVehiculo("2947OT"));

    }
    
}
