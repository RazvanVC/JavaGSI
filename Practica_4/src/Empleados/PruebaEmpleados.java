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
public class PruebaEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1 - creamos la empresa
        Empresa e1 = new Empresa("1234567", "Indra");
        
        //2 - creamos los departamentos
        Departamento d1 = new Departamento(e1, "1", "Madrid", "Informatica");
        Departamento d2 = new Departamento(e1, "2", "Barcelona", "Personal");
        
        //3 - creamos los empleados que asignamos a los departamentos
        Empleado emp1 = new Empleado("Pepe","12345678Z",25,"soltero","programador",d1,1512.0);
        Empleado emp2 = new Empleado("Laura","45673419T",35,"casada","analista",d1,2150.0);
        Empleado emp3 = new Empleado("Marta","56782345F",40,"casada","gerente",d2,2526.0);
        
        //modificamos los datos de los empleados emp1.cumpleaños();
        d1.altaEmpleado(emp1);
        d1.altaEmpleado(emp2);
        d2.altaEmpleado(emp3);
        emp1.setSueldo(2600);
        System.out.println(emp1.toString()); 
        emp2.setCargo("Jefe de Proyecto");
        //modificamos los datos de los empleados 
        emp1.cumpleaños();
        emp1.setSueldo(2000); 
        System.out.println(emp1.toString()); 
        emp2.setCargo("jefe proyecto");
        System.out.println(emp2.toString());
        //imprimimos los elementos del ArrayList
        System.out.println("Empleados departamento: " + d1.getEmpleados());
    } 
}
   
    
