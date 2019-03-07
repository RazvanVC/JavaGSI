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
public class Ejercicio211 {
    public static void main(String args[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int numeros[] = new int[101];
        Random rand = new Random();
        
        for (int i = 0; i<numeros.length; i++) {
            numeros[i] = rand.nextInt(500)+1;
        }
        
        Arrays.sort(numeros);
        
        imprime (numeros);
    
    }
    public static void imprime(int numeros[]){
        for ( int i = 0; i<numeros.length-1; i++){
            if ((int) numeros[i]%2 == 0){
                if (i%10==0){
                    System.out.println("");
                }
                System.out.print(numeros[i] + " p - ");
            }
            else {
                if (i%10==0){
                    System.out.println("");
                }
                System.out.print(numeros[i] + " i - ");
            }
        }
        
    }
}
