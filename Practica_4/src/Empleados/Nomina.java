/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;
import java.time.LocalDate;

/**
 *
 * @author razvanvc
 */
public class Nomina {
    
    //Atributos
    private Empresa empresa;
    private Departamento departamento;
    private Empleado empleado;    
    private LocalDate fecha;
    private double salarioBruto;
    private double retencion;
    private double salarioNeto;

    //Constructor

    public Nomina(Empresa empresa, Departamento departamento, Empleado empleado, double retencion) {
        this.empresa = empresa;
        this.departamento = departamento;
        this.empleado = empleado;
        this.retencion = retencion;
        this.salarioBruto = empleado.getSueldo();
        this.salarioNeto = this.salarioBruto-(this.salarioBruto*retencion);
    }

    public Nomina(Empleado empleado, double retencion) {
        this.empleado = empleado;
        this.retencion = retencion;
        this.empresa = empleado.getDepartamento().getEmpresa();
        this.departamento = empleado.getDepartamento();
        this.salarioBruto = empleado.getSueldo();
        this.salarioNeto = this.salarioBruto-(this.salarioBruto*retencion);
        
    }
    
    
    
    //Metodos
    
    //Get
    public double getSalarioNeto() {
        return salarioNeto;
    }

    public double getRetencion() {
        return retencion;
    }
    
    public double getSalarioBruto() {
        return salarioBruto;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }
    
    public Empleado getEmpleado() {
        return empleado;
    }
    
    public Departamento getDepartamento() {
        return departamento;
    }
    
    public Empresa getEmpresa() {
        return empresa;
    }
    
    //Set
    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    //ToString ()

    @Override
    public String toString() {
        return "Nomina{" + "empresa=" + empresa + ", departamento=" + departamento + ", empleado=" + empleado + ", fecha=" + fecha + ", salarioBruto=" + salarioBruto + ", retencion=" + retencion + "%, salarioNeto=" + salarioNeto + '}';
    }
}