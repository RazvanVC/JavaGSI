/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razvanvc
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto para leer una cadena del teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); //Introduce los decimales con punto y no con coma
        
        String nombre;
        int edad;
        double altura;
        
        System.out.println("\nIntroduce tu nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("\nIntroduce tu edad: ");
        edad = entrada.nextInt ();
        
        System.out.println("\nIntroduce tu altura (en metros): ");
        altura = entrada.nextDouble();
        
        System.out.print("\nTe llamas " + nombre + ", tienes " + edad + "años y mides " +altura+ "metros.");
        
    }

    
    }
    
