import java.io.IOException;
import java.text.DecimalFormat;
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
public class Ejercicio214 {
    public static void main (String args[]) throws IOException {

        double matriz[][] = new double[3][20];
        DecimalFormat df = new DecimalFormat("###,###.00");
 
        //Asignacion de salarios brutos
        for (int i=0; i < matriz[0].length; i++) {
            matriz [0][i] = RandomDecimal(700,300001);
        }
        //Calculo de deducciones
        for (int i=0; i < matriz[1].length; i++) {
            matriz [1][i] = Deducciones(matriz,i);
        }
        //Calculo de salario neto
        for (int i=0; i < matriz[1].length; i++) {
            matriz [2][i] = SalarioFinal(matriz,i);
        }
        //Imprimir la matriz
        
        for (int i=0; i < matriz[0].length; i++) {
            System.out.println(df.format(matriz[0][i]) + "€ - " + df.format(matriz [1][i]) + "€ - " + df.format(matriz[2][i])+ "€");
        }    
    }
    public static double RandomDecimal(double valorMinimo, double valorMaximo) {
        Random rand = new Random();
        return  valorMinimo + ( valorMaximo - valorMinimo ) * rand.nextDouble();
    }
    public static double Deducciones(double matriz[][],int i){
        
        double deduccion;
        
        if (17707.00 > matriz[0][i]){
            deduccion = matriz[0][i]*0.24;
        }
        else if (33007.00 > matriz[0][i]){
            deduccion = matriz[0][i]*0.30;
        }
        else if (53407.00 > matriz[0][i]){
            deduccion = matriz[0][i]*0.40;
        }
        else if (120000.00 > matriz[0][i]){
            deduccion = matriz[0][i]*0.47;
        }
        else if (175000.00 > matriz[0][i]){
            deduccion = matriz[0][i]*0.49;
        }
        else {
            deduccion = matriz[0][i]*0.51;
        }
        return deduccion;
    }
    public static double SalarioFinal (double matriz[][],int i){
        return matriz[0][i]-matriz[1][i];
    }
}
