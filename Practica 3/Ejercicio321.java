
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
public class Ejercicio321 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String tlf;
        String array[] = new String [2];
        
        int Prefijo;
        long Numero;
        
        System.out.println("Introducir número de tlf(formato 91-8885566): ");
        tlf = entrada.readLine();
        
        array = Numeros(tlf);
        
        
        Prefijo = Integer.parseInt(array[0]);
        Numero = Long.parseLong(array[1]);
        
        System.out.println(Prefijo + " + " + Numero);
    }

    public static String[] Numeros(String tlf) {
        
        StringTokenizer codigo = new StringTokenizer(tlf, "-");
        String array[] = new String [2];
        
        while (codigo.hasMoreTokens()) {
            int contador = 0;
            contador ++;
            for (int i = 0; i<=contador; i++){
                String token = codigo.nextToken();
                array [i]=token;  
            }   
        }
        return array;
    }


}
