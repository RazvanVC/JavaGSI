/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.ArrayList;

/**
 *
 * @author razvanvc
 */
public class Tratamiento {
    //Atributos
    private int duracion;
    private int frecuenciaDeVisitas;
    private double precioBase;
    private Dentista dentista;
    private ArrayList<Paciente> listapacientes;

    //Constructor
    public Tratamiento(int duracion, int frecuenciaDeVisitas, double precioBase, Dentista dentista, ArrayList<Paciente> pacientes) {
        this.duracion = duracion;
        this.frecuenciaDeVisitas = frecuenciaDeVisitas;
        this.precioBase = precioBase;
        this.dentista = dentista;
        this.listapacientes = pacientes;
    }
    
    
    //Metodos
    public ArrayList<Paciente> getPacientes() {
        return listapacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.listapacientes = pacientes;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }


    public int getFrecuenciaDeVisitas() {
        return frecuenciaDeVisitas;
    }

    public void setFrecuenciaDeVisitas(int frecuenciaDeVisitas) {
        this.frecuenciaDeVisitas = frecuenciaDeVisitas;
    }
    
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double altaPaciente(Paciente p){
        double importe = this.precioBase;
        
        if (p.getEdad() > 65){
            importe *= 0.85;
        }
        else if(p.isDesempleado()){
            importe *= 0.80;
        } 
        else {
            importe *= 1;
        }
        
        return importe;
    }
    public boolean bajaPaciente(Paciente p){
        boolean bajaexitosa = false;
        
        if (this.listapacientes.contains(p)){
            this.listapacientes.remove(p);
            bajaexitosa = true;
        }
        return bajaexitosa;
    }

    @Override
    public String toString() {
        return "Tratamiento{" + "duracion=" + duracion + ", frecuenciaDeVisitas=" + frecuenciaDeVisitas + ", precioBase=" + precioBase + ", dentista=" + dentista + '}';
    }
}
