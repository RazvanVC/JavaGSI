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
public class PruebaEmpleados2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1 - creamos la empresa
        Empresa e1 = new Empresa("1234567", "Indra");
        
        //2 - creamos los departamentos
        Departamento d1 = new Departamento(e1, "1", "Madrid", "Informatica");
        Departamento d2 = new Departamento(e1, "2", "Barcelona", "Personal");
        
        //3 - creamos los empleados que asignamos a los departamentos
        Empleado emp1 = new Empleado("Pepe","12345678Z",25,"soltero","programador",d1,1512.0);
        Empleado emp2 = new Empleado("Laura","45673419T",35,"casada","analista",d1,2150.0);
        Empleado emp3 = new Empleado("Marta","56782345F",40,"casada","gerente",d2,2526.0);
        
        //4 - creamos las nominas
        Nomina n1 = new Nomina(e1,d1,emp1,50);
        Nomina n2 = new Nomina(e1,d1,emp2,30);
        Nomina n3 = new Nomina(emp3,20);
        
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());
    }
    
}
