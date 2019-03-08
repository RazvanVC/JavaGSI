
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razvanvc
 */
public class Ejercicio144 {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        int entero1, entero2, entero3, mayorprov, mayordef;
        
        System.out.println("Introduce el primer número: ");
        entero1 = entrada.nextInt();
        System.out.println("Introduce el segundo número: ");
        entero2 = entrada.nextInt();
        System.out.println("Introduce el tercer número: ");
        entero3 = entrada.nextInt();
        
        mayorprov = mayor(entero1,entero2);
        mayordef = mayor(mayorprov,entero3);
        
        System.out.println("\nTus numeros son: " + entero1 + ", " + entero2 + " y " + entero3);
        System.out.println("El numero mayor es: "+ mayordef);
        
        
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
    

