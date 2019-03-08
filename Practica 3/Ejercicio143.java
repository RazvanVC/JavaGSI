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

public class Ejercicio143 {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        int entero1, entero2, elmayor;
        
        System.out.println("Introduce el primer número: ");
        entero1 = entrada.nextInt();
        System.out.println("Introduce el segundo número: ");
        entero2 = entrada.nextInt();
        
        elmayor = mayor(entero1,entero2);
        
        System.out.println("\nTus numeros son: " + entero1 + " y " + entero2);
        System.out.println("El numero mayor es: "+ elmayor);
        
        
    }
    public static int mayor (int num1, int num2){
        int mayor;
        if (num1>num2){
            mayor = num1;
        }
        else {
            mayor = num2;
        }
        return mayor;
    } 
    
}
