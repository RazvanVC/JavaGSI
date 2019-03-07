
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class Ejercicio322 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String frase;
        int npalabras;
        
        System.out.println("Introducir una frase: ");
        frase = entrada.readLine();
        
        npalabras = ContarPalabras(frase);
        
        System.out.println("\nLa frase: \n" + frase + "\nTiene " + npalabras + " palabras");
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
    
}
