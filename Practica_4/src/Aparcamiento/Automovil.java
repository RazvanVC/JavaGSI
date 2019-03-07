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
public class Automovil extends Vehiculo {

    //Atributos
    private String tipo;

    //Constructor
    public Automovil(String matricula, boolean abono,String tipo) {
        super(matricula, abono);
        this.tipo = tipo;
    }

    public Automovil(String matricula, LocalTime fecha, boolean abono,String tipo) {
        super(matricula, fecha, abono);
        this.tipo = tipo;
    }
    
    //Metodos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularImporte() {
        //C reacion variables locales
        double importe = 0;
        String tipoV = this.tipo;
        
        //Consecucion tiempo
        LocalTime tiempoEntrada = this.fecha;
        LocalTime tiempoActual = LocalTime.now();
        Duration tiempo = between(tiempoEntrada, tiempoActual);
        long minutos = tiempo.toMinutes();
        //System.out.println(minutos);
        
        //Operacion segun tipo de vehiculo
        switch (tipoV) {
            case "turismo":
                importe = 1.5*minutos/60;
                break;
            case "todoterreno":
                importe = 2.5*minutos/60;
                break;
            case "furgoneta":
                importe = 3.5*minutos/60;
                break;
        }
        
        if (this.isAbono())importe = importe * 0.6;
        
        return importe;
    }  
}
