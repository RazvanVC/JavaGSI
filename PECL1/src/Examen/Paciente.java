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
public class Paciente extends Persona {
    
    //Atributos
    private int edad;    
    private int numeroDeHistoria;
    private Tratamiento tratamiento;
    private boolean desempleado;
  
    //constructor
    
    public Paciente(String nombre, String nif,int edad, int numeroDeHistoria, Tratamiento tratamiento, boolean desempleado) {
        super(nombre, nif);
        this.edad = edad;
        this.numeroDeHistoria = numeroDeHistoria;
        this.tratamiento = tratamiento;
        this.desempleado = desempleado;
    }
    
    //Metodos
    
    public boolean isDesempleado() {
        return desempleado;
    }

    public void setDesempleado(boolean desempleado) {
        this.desempleado = desempleado;
    }
    
    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public int getNumeroDeHistoria() {
        return numeroDeHistoria;
    }

    public void setNumeroDeHistoria(int numeroDeHistoria) {
        this.numeroDeHistoria = numeroDeHistoria;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() + "Paciente{" + "edad=" + edad + ", numeroDeHistoria=" + numeroDeHistoria + ", tratamiento=" + tratamiento + ", desempleado=" + desempleado + '}';
    }   
}
