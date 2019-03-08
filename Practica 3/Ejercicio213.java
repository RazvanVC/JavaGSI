
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razvanvc
 */
public class Ejercicio213 {
    public static void main (String args[]) throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int DNI;
        String LetraNIF;
        System.out.println("Introduce el numero de DNI: ");
        DNI = Integer.parseInt(entrada.readLine());
        LetraNIF = NIF(DNI);
        System.out.println("\nTu NIF es: "+DNI+"-"+LetraNIF);
        
    }
    public static String NIF (int DNI){
        int resto = DNI%23;
        String letra;
        String LaDevolver[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        letra = LaDevolver[resto];
        return letra;
    }
}
