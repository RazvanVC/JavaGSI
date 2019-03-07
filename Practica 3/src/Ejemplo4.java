/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author razvanvc
 */
public class Ejemplo4 {
    public static void main(String args[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int numeros[] = new int[10];
        boolean adivinado = false;
        Random rand = new Random();
        
        //generamos números aleatorios entre el 0 y el 15
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(16);
        }
        
        //Ordenamos el array
        Arrays.sort(numeros);
        
        //Pedimos el número
        System.out.println("Introduzca el número (0-15):");
        num = Integer.parseInt(entrada.readLine());
        
        //llamamos al método
        adivinado = adivinado(numeros, num);
        if (adivinado) {
            System.out.println("\nNúmero adivinado");
        } 
        else {
            System.out.println("\nNúmero NO adivinado");
        }
        //Imprimimos todos los números
        System.out.println("\nTodos los números:");
        for (int i = 0; i < numeros.length; i++) {
        System.out.print(" " + numeros[i]);
        }
    }
    public static boolean adivinado(int numeros[], int num) {
        return (Arrays.binarySearch(numeros, num) >= 0);
    }
}