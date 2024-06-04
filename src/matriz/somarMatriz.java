/*Escreva um programa em Java que calcule a soma de todos os elementos de uma matriz quadrada 4x4.*/

import java.util.Random;

public class somarMatriz {

    public class static void main (String[] args) {

        Random number = new Random();
      
        int[][] matriz = new int[4][4];
        int some = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; i < 4; i++) {
                matriz[i][j] = number(11);
                some += matriz[i][j];
            }
        }
      
    }
  
}
