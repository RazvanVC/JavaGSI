
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razvanvc
 */
public class Ejercicio323 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        String frase;
        int palabrasfrase;

        
        System.out.println("Introducir una frase: ");
        frase = entrada.readLine();
        
        palabrasfrase = ContarPalabras(frase);
        
        String array [] = new String [palabrasfrase];
        array = InvertirPalabras (frase,palabrasfrase);
        ImprimeArrays(array);
        

        
    }
    public static int ContarPalabras(String frase) {
        
        StringTokenizer codigo = new StringTokenizer(frase, " ");
        int contador = 0;
        
        while (codigo.hasMoreTokens()) {
            contador ++;
            String token = codigo.nextToken();
        }
        return contador;
    }
    
    public static String [] InvertirPalabras(String frase, int palabrasfrase) {
        
        StringTokenizer codigo = new StringTokenizer(frase, " ");
        String array[] = new String [palabrasfrase];
        
        while (codigo.hasMoreTokens()) {
            for (int i = palabrasfrase-1; i>=0; i--){
                String token = codigo.nextToken();
                array [i]=token;
            }
        }
        return array;
    }
    
    public static void ImprimeArrays (String array[]){
        for (int i=0; i < array.length ;i++){
            System.out.print(array[i] + " ");
        }
    }
}