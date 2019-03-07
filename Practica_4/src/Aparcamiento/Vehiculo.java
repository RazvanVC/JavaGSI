/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aparcamiento;

import java.time.LocalTime;

/**
 *
 * @author razvanvc
 */
public abstract class Vehiculo {
    
    //Atributos
    private String matricula;
    protected LocalTime fecha;
    private boolean abono;

    //Constructor
    public Vehiculo(String matricula, boolean abono) {
        this.matricula = matricula;
        this.abono = abono;
        this.fecha = LocalTime.now();
    }

    public Vehiculo(String matricula, LocalTime fecha, boolean abono) {
        this.matricula = matricula;
        this.fecha = fecha;
        this.abono = abono;
    }
    
    
    //Metodos

    public boolean isAbono() {
        return abono;
    }
    public void setAbono(boolean abono) {
        this.abono = abono;
    }


    public LocalTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
    }


    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    public abstract double calcularImporte ();
}
