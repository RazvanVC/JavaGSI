/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razvanvc
 */

import java.io.*;

public class Ejemplo3 {
    public static void main(String args[]) throws IOException {
        BufferedReader entrada=
            new BufferedReader(new InputStreamReader(System.in));
        
        double base = 0, exponente = 0, resultado;
        
        System.out.println("\nIntroduce la base:");
        base = Double.parseDouble(entrada.readLine());
        
        System.out.println("\nIntroduce el exponente:");
        exponente = Double.parseDouble(entrada.readLine());
        
        //llamamos al método
        resultado = calcula(base, exponente);
        System.out.println("\n\nEl resultado es: "+resultado);
        }
    
    public static double calcula(double num1, double num2) {
        //Calculamos con el método pow de la clase Math
        return Math.pow(num1, num2);
}
    
}
