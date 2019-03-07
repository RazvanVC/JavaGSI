/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 1. Realizar un programa que pida como entrada un número decimal y lo muestre
redondeado al entero más próximo.
 @author razvanvc
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    entrada.useLocale(Locale.US);
    
    double decimal;
    int redondeo;
    
    System.out.println("Escribe un número decimal:");
    
    decimal = entrada.nextDouble();
    redondeo = (int) (decimal + 0.5);
    
    System.out.println("Número: " + decimal + " - redondeado: " + redondeo);
    }
    
}
