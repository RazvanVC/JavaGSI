/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
4. Realizar un programa que pida dos enteros y muestre cual es el mayor y el menor,
si son iguales lo indicará también.
@author razvanvc
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Introduce numero 1:");
        n1 = entrada.nextInt();
        
        System.out.println("Introduce numero 2:");
        n2 = entrada.nextInt();
        
        if (n1 == n2) {
        System.out.println("Son iguales");
        } 
        else {
            if (n1<n2) {
                System.out.println(n1 + " es menor que " + n2);
        }
            else {
                System.out.println(n1 + " es mayor que " + n2);
            }
        }
    }
    
}
