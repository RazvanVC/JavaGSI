
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razvanvc
 */
public class Ejercicio145 {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        double entero1, entero2, resultado;
        String operacion;
        
        
        System.out.print("Introduce el primer número: ");
        entero1 = entrada.nextDouble();
        System.out.print("Introduce el segundo número: ");
        entero2 = entrada.nextDouble();
        System.out.print("Introduce la operacion: ");
        operacion = entrada.next();
        
        resultado = calculadora(entero1,entero2,operacion);
        
        System.out.println("Tu resultado es: " + resultado);
        
    }
    public static double calculadora (double num1, double num2, String operacion) {
        double resultado;
        
        if (null == operacion){
            System.out.println("Operacion no valida.");
            resultado = 0;
        }
        else switch (operacion) {
            case "+":
                resultado = num1+num2;
                break;
            case "-":
                resultado = num1-num2;
                break;
            case "/":
                resultado = num1/num2;
                break;
            case "*":
                resultado = num1*num2;
                break;
            default:
                System.out.println("Operacion no valida.");
                resultado = 0;
                break;
        }
        return resultado;
    }
}
