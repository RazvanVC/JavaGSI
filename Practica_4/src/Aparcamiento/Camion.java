/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aparcamiento;

import java.time.Duration;
import static java.time.Duration.between;
import java.time.LocalTime;

/**
 *
 * @author razvanvc
 */
public class Camion extends Vehiculo{
    
    //Atributos
    private int nejes;

    //Constructor

    public Camion(String matricula, boolean abono,int nejes) {
        super(matricula, abono);
        this.nejes = nejes;
    }

    public Camion(String matricula, LocalTime fecha, boolean abono,int nejes) {
        super(matricula, fecha, abono);
        this.nejes = nejes;
    }
    


    
    //Metodos
    
    public int getNejes() {
        return nejes;
    }

    public void setNejes(int nejes) {
        this.nejes = nejes;
    }

    @Override
    public double calcularImporte() {
        //C reacion variables locales
        double importe = 0;
        int ejes = this.nejes;
        
        //Consecucion tiempo
        LocalTime tiempoEntrada = this.fecha;
        LocalTime tiempoActual = LocalTime.now();
        Duration tiempo = between(tiempoEntrada, tiempoActual);
        long minutos = tiempo.toMinutes();
        //System.out.println(minutos);
        
        //Operacion segun tipo de vehiculo
        if (ejes<=3){
            importe = 4.5*minutos/60;
        }
        else {
            importe = 6.5*minutos/60;
        }
        if (this.isAbono())importe = importe * 0.6;
        
        return importe;
    }
}
