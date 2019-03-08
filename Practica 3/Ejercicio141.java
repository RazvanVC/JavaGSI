/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razvanvc
 */

import java.util.Scanner;

public class Ejercicio141 {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        int entero1, entero2;
        
        System.out.println("Introduce el primer número: ");
        entero1 = entrada.nextInt();
        System.out.println("Introduce el segundo número: ");
        entero2 = entrada.nextInt();
        
        System.out.println("Tus numeros son: ");
        
        imprime(entero1, entero2);
    }
    
    public static void imprime (int numeromenor, int numeromayor) {
        for (int i = numeromenor; i<(numeromayor+1); i++){
            System.out.println("");
            System.out.println(i);
        }
    }
            
}