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
public class PruebaClinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Personal Administrativo (String nombre, String nif, String categoria)
        PersonalA pa1 = new PersonalA("Jaime", "06724534Z", "gerente");
        PersonalA pa2 = new PersonalA("Sara", "12374326T", "secretario");
        PersonalA pa3 = new PersonalA("Laura", "12376546Y", "gestor");
        PersonalA pa4 = new PersonalA("Carlos", "98125376P", "atencion al cliente");
        
        //Añadimos el personal para introducirlo en la clinica
        ArrayList<PersonalA> listapersonalA = new ArrayList<>();
        listapersonalA.add(pa1);
        listapersonalA.add(pa2);
        listapersonalA.add(pa3);
        listapersonalA.add(pa4);
        
        //Dentista (String nombre, String nif,String especialidad)
        Dentista d1 = new Dentista("Juan", "15345673T", "odontologia");
        Dentista d2 = new Dentista("Javier", "12476258T", "Endodoncista");
        Dentista d3 = new Dentista("Yusep", "15345673T", "Periodoncista");
        Dentista d4 = new Dentista("Ricardo", "15345673T", "Protesista");
        
        //Añadimos los dentistas para introducirlos en la clinica
        ArrayList<Dentista> listadentistas = new ArrayList<>();
        listadentistas.add(d1);
        listadentistas.add(d2);
        listadentistas.add(d3);
        listadentistas.add(d4);
        
        //Tratamientos (int duracion, int frecuenciaDeVisitas, double precioBase, Dentista dentista, ArrayList<Paciente> pacientes)
        ArrayList<Paciente> pc1 = new ArrayList<>();
        ArrayList<Paciente> pc2 = new ArrayList<>();
        ArrayList<Paciente> pc3 = new ArrayList<>();
        ArrayList<Paciente> pc4 = new ArrayList<>();
        
        Tratamiento t1 = new Tratamiento(10, 2, 1700, d1, pc1);
        Tratamiento t2 = new Tratamiento(100, 20, 2300, d2, pc2);
        Tratamiento t3 = new Tratamiento(30, 4, 1900, d3, pc3);
        Tratamiento t4 = new Tratamiento(230, 30, 4500, d4, pc4);
        
        ArrayList<Tratamiento> listatratamientos = new ArrayList<>();
        
        listatratamientos.add(t1);
        listatratamientos.add(t2);
        listatratamientos.add(t3);
        listatratamientos.add(t4);
        
        
        //Pacientes (String nombre, String nif,int edad, int numeroDeHistoria, Tratamiento tratamiento, boolean desempleado)
        Paciente p1 = new Paciente("Raul", "12476258T",17, 1, t1, true);
        Paciente p2 = new Paciente("Raul", "12476258T",54, 1, t2, false);
        Paciente p3 = new Paciente("Raul", "12476258T",30, 1, t3, true);
        Paciente p4 = new Paciente("Raul", "12476258T",72, 1, t4, false);
        
        pc1.add(p1);
        pc2.add(p2);
        pc3.add(p3);
        pc4.add(p4);
        
        ArrayList<Paciente> listapacientes = new ArrayList<>();
        listapacientes.add(p1);
        listapacientes.add(p2);
        listapacientes.add(p3);
        listapacientes.add(p4);
        
        //Clinica (String cif, String nombre,ArrayList<Tratamiento> listatratamientos, ArrayList<PersonalA> listapersonalA, ArrayList<Dentista> listadentistas, ArrayList<Paciente> listapacientes)
        Clinica c1 = new Clinica("9887236784", "Clinica Laura",listatratamientos, listapersonalA,listadentistas, listapacientes);
        
        
        System.out.println("El paciente: "+p1.toString()+", ha de pagar "+t1.altaPaciente(p1)+"€"+"\n");
        System.out.println("El paciente: "+p2.toString()+", ha de pagar "+t2.altaPaciente(p1)+"€"+"\n");
        System.out.println("El paciente: "+p4.toString()+", ha de pagar "+t4.altaPaciente(p1)+"€"+"\n");
        
        System.out.println("El paciente: "+ p2.toString() + ", estado baja: "+ t3.bajaPaciente(p3) +"\n");
        System.out.println("El paciente: "+ p2.toString() + ", estado baja: "+ t3.bajaPaciente(p3) +"\n");
        
        System.out.println("Listado de tratamientos: ");
        c1.listadoTratamientos();
    }
    
}
