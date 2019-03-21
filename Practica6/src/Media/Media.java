/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Media;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author razvanvc
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 0, contador = 0;
        double media;
        String nota = "";
        //Objeto para leer una cadena del teclado 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while (!"F".equals(nota)) {
            try {
                System.out.println("\nTeclee calificación (A,B,C,D,E): ");
                nota = entrada.readLine();
                if ((!(nota.toUpperCase().equals("A"))) && (!(nota.toUpperCase().equals("B"))) && (!(nota.toUpperCase().equals("C"))) && (!(nota.toUpperCase().equals("D"))) && (!(nota.toUpperCase().equals("E")))) {
                    throw new notaMal();
                }
                switch (nota) {
                    case "A":
                        total += 4;
                        contador++;
                        break;
                    case "B":
                        total += 3;
                        contador++;
                        break;
                    case "C":
                        total += 2;
                        contador++;
                        break;
                    case "D":
                        total += 1;
                        contador++;
                        break;
                    case "E":
                        total += 0;
                        contador++;
                        break;
                }
            } catch (notaMal nm) {
                System.out.println("\n" + nm.getMessage());
            } catch (NumberFormatException nfe) {
                if (!nota.equals("F")) {
                    System.out.println("\nError de formato numérico: " + nfe.toString());
                }
            } catch (IOException ioe) {
                System.out.println("\nError de entrada/salida: " + ioe.toString());
            } catch (Exception e) {
                // Captura cualquier otra excepción
                System.out.println("Excepción: " + e.toString());
            }
        }
        media = total / contador;

        System.out.println("\n\nEl promedio del grupo es: " + media);
    }
}