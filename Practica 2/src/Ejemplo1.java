/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razvanvc
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo1 {
    
    public static void main(String args[]) throws IOException{
    //Objeto para leer una cadena del teclado
        BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
        
        String nombre;
        int edad;
        double altura;
        
        System.out.println("\nIntroduce tu nombre: ");
        nombre = entrada.readLine();
        
        System.out.println("\nIntroduce tu edad: ");
        edad = Integer.parseInt(entrada.readLine()); //conversion de cadena a numero
        
        System.out.println("\nIntroduce tu altura (en metros): "); //decimal con punto
        altura = Double.parseDouble(entrada.readLine());
        
        System.out.print("\nTe llamas " + nombre + ", tienes " + edad + " años y mides " + altura + " metros.");
    }
        
    
}
