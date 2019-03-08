
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
public class Ejercicio311 {
    public static void main (String args[]) throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int numero;
        String palabra;
        
        System.out.println("Escribe una palabra: ");
        palabra = entrada.readLine();
        
        System.out.println("Introduce el numero de rotaciones: ");
        numero = Integer.parseInt(entrada.readLine());
        
        for (int i = 0 ; i < numero; i++){
            String CaracterS = palabra.substring(0,1);
            String CadenaProvisional = palabra.substring(1,palabra.length());
            palabra = CadenaProvisional.concat(CaracterS);
        }
        System.out.println("Tu cadena es: " + palabra);
    }
    
}
