/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
3. Realizar un programa que calcule la pendiente de una línea recta dada por dos
puntos de la misma (x1,y1) y (x2,y2).
@author razvanvc
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double pendiente;
        int x1, x2, y1, y2;
        
        System.out.println("Introduce x1:");
        x1 = entrada.nextInt();
        
        System.out.println("Introduce y1:");
        y1 = entrada.nextInt();
        
        System.out.println("Introduce x2:");
        x2 = entrada.nextInt();
        
        System.out.println("Introduce y2:");
        y2 = entrada.nextInt();
        
        pendiente = (double) (y2 - y1) / (x2 - x1);
        System.out.println("Pendiente: " + pendiente);
        
    }
    
}
