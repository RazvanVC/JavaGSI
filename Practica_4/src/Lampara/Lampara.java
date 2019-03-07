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
public class Lampara {
    
    //Atributos
    
    private boolean encendido;
    private int intensidad;
    
    //Constructor

    public Lampara() {
        encendido = false;
        intensidad = 0;
    }
    
    
    
    //Metodos
    
    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }
    
    public void setIntensidad(double voltaje) {
        if (voltaje <= 1.5) {
            this.intensidad = 0;
        }
        else if (voltaje >= 12.5 ){
            this.intensidad = 100;
        }
        else {
            this.intensidad = calcularIntensidad (voltaje);
        }
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
 
    private int calcularIntensidad(double voltaje){
        return (int) ((voltaje * 100.0) / 12.5);
    }

    @Override
    public String toString() {
        
        String encendidotxt = "";
        if (encendido) {
            encendidotxt = "ON";
        }
        else {
            encendidotxt = "OFF";
        }
        
        return "Luz: " + encendidotxt + ", Intensidad: " + this.intensidad; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
