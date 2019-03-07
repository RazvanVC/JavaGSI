/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lampara;

/**
 *
 * @author razvanvc
 */
public class PruebaLampara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lampara l1 = new Lampara ();
        Lampara l2 = new Lampara ();
        Lampara l3 = new Lampara ();
        
        l1.setIntensidad(0.0);
        
        l2.setIntensidad(10.0);
        l2.setEncendido(true);
        
        l3.setIntensidad(35);
        l3.setEncendido(true);
        
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
    }
    
}
