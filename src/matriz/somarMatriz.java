/*Escreva um programa em Java que calcule a soma de todos os elementos de uma matriz quadrada 4x4.*/

import java.util.Random;

public class somarMatriz {

    public static void main (String[] args) {

        Random number = new Random();
      
        int[][] matriz = new int[4][4];
        int some = 0;

        for (int i = 0; i < 4; i++) {
        	
            for (int j = 0; j < 4; j++) {
            	
                matriz[i][j] = number.nextInt(11);
                some += matriz[i][j];
                System.out.print(matriz[i][j] + "\t");
                
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Soma de todos elementos: " + some);
      
    }
  
}
