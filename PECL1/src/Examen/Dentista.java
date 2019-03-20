/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author razvanvc
 */
public class Dentista extends Persona{
    
    //Atributos
    private String especialidad;

    //Constructor

    public Dentista(String nombre, String nif,String especialidad) {
        super(nombre, nif);
        this.especialidad = especialidad;
    }
        
    //Metodos
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
}
