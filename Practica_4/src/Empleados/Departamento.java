/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;
import java.util.ArrayList;

/**
 *
 * @author razvanvc
 */
public class Departamento {
    
    //Atributos
    private Empresa empresa;    
    private ArrayList<Empleado> empleados;    
    private String id;    
    private String localizacion;
    private String nombre;
    
    //Constructor
    public Departamento(Empresa empresa, String id, String localizacion, String nombre) {
        this.empresa = empresa;
        this.id = id;
        this.localizacion = localizacion;
        this.nombre = nombre;
        this.empleados = new ArrayList<Empleado>();
    }
    
    //Metodos
    
    //Get
    
    public String getNombre() {
        return nombre;
    }
    public String getLocalizacion() {
        return localizacion;
    }
    public String getId() {
        return id;
    }
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    
    //Set
    
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }   
    public void setId(String id) {
        this.id = id;
    }
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    
    //Extra
    
    public void altaEmpleado (Empleado emp){
        if (!empleados.contains(emp)){
            empleados.add(emp);
            emp.setDepartamento(this);
        }
    }
    public void bajaEmpleado (Empleado emp){
        if (empleados.contains(emp)){
            empleados.remove(emp);
            emp.setDepartamento(this);
        }
    }
    

    @Override
    public String toString() {
        return "Departamento{" + " Empresa= " + empresa + ", localizacion=" 
                + localizacion + ", ID= "+ id + ", nombre=" + nombre + '}';
    }
}