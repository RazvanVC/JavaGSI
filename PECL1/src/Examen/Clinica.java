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
public class Clinica extends Empresa{
    
    //Atributos
    private ArrayList<Tratamiento> listatratamientos;
    private ArrayList<PersonalA> listapersonalA;
    private ArrayList<Dentista> listadentistas;
    private ArrayList<Paciente> listapacientes;
    
    //Constructor
    public Clinica(String cif, String nombre,ArrayList<Tratamiento> listatratamientos, ArrayList<PersonalA> listapersonalA, ArrayList<Dentista> listadentistas, ArrayList<Paciente> listapacientes) {
        super(cif, nombre);
        this.listatratamientos = listatratamientos;
        this.listapersonalA = listapersonalA;
        this.listadentistas = listadentistas;
        this.listapacientes = listapacientes;
    }

    //Metodos
    public ArrayList<Tratamiento> getListatratamientos() {
        return listatratamientos;
    }
    public void setListatratamientos(ArrayList<Tratamiento> listatratamientos) {
        this.listatratamientos = listatratamientos;
    }
    public ArrayList<PersonalA> getListapersonalA() {
        return listapersonalA;
    }
    public void setListapersonalA(ArrayList<PersonalA> listapersonalA) {
        this.listapersonalA = listapersonalA;
    }
    public ArrayList<Dentista> getListadentistas() {
        return listadentistas;
    }
    public void setListadentistas(ArrayList<Dentista> listadentistas) {
        this.listadentistas = listadentistas;
    }

    public ArrayList<Paciente> getListapacientes() {
        return listapacientes;
    }
    public void setListapacientes(ArrayList<Paciente> listapacientes) {
        this.listapacientes = listapacientes;
    }
    
    public void listadoTratamientos (){
        int n = this.listatratamientos.size();
        int i = 0;
        while (i<n) {
            Tratamiento t1 = listatratamientos.get(i);
            System.out.println("\n"+t1.toString());
            i++;
        }
    } 
}
