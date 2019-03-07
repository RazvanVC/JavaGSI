
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razvanvc
 */
public class Ejercicio313 {
    public static void main (String args[]) throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        String palabra;
        int Vocales [];
        char [] vocales = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("Escribe una palabra: ");
        palabra = entrada.readLine();
        
        Vocales = ContarVocales(palabra);
        
        System.out.println(Arrays.toString(vocales));
        System.out.println(Arrays.toString(Vocales));
        
        
    }
    public static int[] ContarVocales(String palabra){
        int ContadorA=0, ContadorE=0, ContadorI=0, ContadorO=0, ContadorU=0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i<palabra.length();i++){
            switch (palabra.charAt(i)) {
                case 'a':
                    ContadorA += 1;
                    break;
                case 'e':
                    ContadorE += 1;
                    break;
                case 'i':
                    ContadorI += 1;
                    break;
                case 'o':
                    ContadorO += 1;
                    break;
                case 'u':
                    ContadorU += 1;
                    break;
                default:
                    break;
            }
            
        }
        int Contadores []=new int [5];
        Contadores[0] = ContadorA;
        Contadores[1] = ContadorE;
        Contadores[2] = ContadorI;
        Contadores[3] = ContadorO;
        Contadores[4] = ContadorU;

        return Contadores;
        
    }
}


