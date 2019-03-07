/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 2. Realizar un programa que calcule la longitud y el área de una circunferencia.
 @author razvanvc
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double radio, area, longitud;
        
        System.out.println("Escribe el radio:");
        radio = entrada.nextDouble();
        
        longitud = 2 * Math.PI * radio;
        area = Math.PI * radio * radio;
        
        System.out.println("Longitud circunferencia: " + longitud);
        System.out.println("Área circunferencia: " + area);
    }
    
    
}
