
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razvanvc
 */
public class Ejercicio212 {
    public static void main (String args[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int vocales;
        int numeros[] = new int[50];
        Random rand = new Random();
        
        for (int i = 0; i<numeros.length; i++) {
            numeros[i] = rand.nextInt(26)+ 97;
        }
        
        Arrays.sort(numeros);
        
        vocales = vocales (numeros);
        System.out.println(vocales);
        
    
    }
    public static int vocales(int numeros[]){
        int contador = 0;
        for ( int i = 0; i<numeros.length-1; i++){
            if ((int) numeros[i] == 97 || (int) numeros[i] == 101 ||(int) numeros[i] == 105||(int) numeros[i] == 112||(int) numeros[i] == 118){
                contador += 1;
            }

            }
        return contador;
          
        }
        
        
    }

