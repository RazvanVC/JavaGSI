/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

/**
 *
 * @author razvanvc
 */
public class Empleado extends Persona {
    
    //Atributos
    private String cargo;    
    private Departamento departamento;    
    private double sueldo;

    //Constructor
    public Empleado(String nombre,String DNI, int edad, String estado, String cargo, Departamento departamento, double sueldo){
        super(nombre,DNI,edad,estado);
        this.cargo = cargo;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.departamento.altaEmpleado(this);
    }

    //Metodos
    
    //Get
    public double getSueldo() {
        return sueldo;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public String getCargo() {
        return cargo;
    }

    //Set
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    

    //ToString()
    @Override
    public String toString() {
        return super.toString() + " # Empleado{" + "sueldo=" + sueldo + ", cargo=" + cargo + ", departamento=" + departamento + '}';
    }
}
