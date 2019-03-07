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

public class Ejemplo1 {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int n = entrada.nextInt();
        eco(n); //llamada a la función
    
    }
    public static void eco(int veces) {
        for (int i = 0; i < veces; i++) {
        System.out.println("Eco...");
        }
    }
    
}
