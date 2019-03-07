/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;
import java.util.ArrayList;

/**
 *
 * @author razvanvc
 */
public class Vehiculo {
    
    //Atributos
    private String matricula;
    private String marca;
    private String modelo;
    private ArrayList<Pieza> piezas;

    public Vehiculo(String matricula, String marca, String modelo, ArrayList<Pieza> piezas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.piezas = piezas;
    }

    //Constructor
    
    //Metodos
    
    //Get
    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public String getMatricula() {
        return matricula;
    }
    
    //Set
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
