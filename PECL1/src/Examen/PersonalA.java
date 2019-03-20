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
public class PersonalA extends Persona {
    
    //Atributos
    private String categoria;
    
    //Constructor

    public PersonalA(String nombre, String nif,String categoria) {
        super(nombre, nif);
        this.categoria = categoria;
    }
    
    //Metodos
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}
