
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
public class Ejercicio314 {
    public static void main (String args[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int numerosNIF;
        String NIF, LetraNIF,numerosNIFP,LetraNIFV;
        boolean Cierto;
        
        System.out.println("Escribe tu DNI: ");
        NIF = entrada.readLine();
        
        numerosNIFP = NIF.substring(0,8);
        numerosNIF = Integer.parseInt(numerosNIFP);
        LetraNIF = NIF.substring(8,9);
        
        LetraNIFV = NIF(numerosNIF);
        Cierto = CompruebaNIF(LetraNIF,LetraNIFV);
        System.out.println(Cierto);
        
    }
    public static String NIF (int DNI){
        int resto = DNI%23;
        String letra;
        String LaDevolver[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        letra = LaDevolver[resto];
        return letra;
    }
    public static boolean CompruebaNIF (String NIFV,String NIFC){
        return NIFV.equals(NIFC);
    }
    
}
//09046478A (DNI IRENE)