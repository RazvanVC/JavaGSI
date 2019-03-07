/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author razvanvc
 */
public class Vehiculo {
    
    //Atributos
    
    private String matricula;
    private String marca;    
    private String modelo;
    private int velocidad;
    private boolean luces;  
    private int marcha;



    //Constructor

    public Vehiculo(String matricula, String marca, String modelo, int velocidad, boolean luces) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.luces = luces;
    }

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
        this.luces = false;
    }

    public Vehiculo(String matricula, String marca, String modelo, int marcha) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.luces = false;
        this.setMarcha(marcha);
    }

    //Metodos
    
    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
        switch (marcha) {
            case 0: setVelocidad(0);
                    break;
            case 1: setVelocidad(10);
                    break;
            case 2: setVelocidad(30);
                    break;
            case 3: setVelocidad(60);
                    break;
            case 4: setVelocidad(90);
                    break;
            case 5: setVelocidad(120);
                    break;        
        }
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        String lucestxt = "";
        
        if (luces){
            lucestxt = "luces encendidas";
        }
        else {
            lucestxt = "luces apagadas";
        }
        return "Vehiculo{ matricula=" + this.matricula + ", marca=" + this.marca + 
                ", modelo= " + this.modelo + ", velocidad= " + this.velocidad + 
                ", luces " + lucestxt + ", marcha= "+this.marcha+ "}";   
    }
}