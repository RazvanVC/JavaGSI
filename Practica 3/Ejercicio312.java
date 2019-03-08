
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razvanvc
 */
public class Ejercicio312 {
    public static void main (String args[]) throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        String palabra, palabra2;
        char caracter;
        
        System.out.println("Escribe una palabra: ");
        palabra = entrada.readLine();
        System.out.println("Escribe una letra: ");
        palabra2 = entrada.readLine();
        caracter = palabra2.charAt(0);
        
        System.out.println("Las posiciones de la letra: " + caracter + "\nSon: ");
        Posiciones (palabra,caracter);
        
    }
    public static void Posiciones(String palabra,char caracter){
        for (int i = 0; i<palabra.length();i++){
            if (palabra.charAt(i) == caracter){
                System.out.print(i + " " );
            }
        }
    }  
}