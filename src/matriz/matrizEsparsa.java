/*Escreva um programa em Java que determine se uma matriz 4x4 é uma matriz esparsa (ou seja, se mais da metade dos elementos são zeros).*/

import java.util.Random;

public class matrizEsparsa {

    public static void main(String[] args) {

        Random zero = new Random();

        int[][] M = new int[4][4];
        int contZero = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                M[i][j] = zero.nextInt(2);
                if (M[i][j] == 0) {
                    contZero++;
                }
            }
        }

        if (contZero > 8) {
            System.out.println("A matriz é Esparsa pois possui " + contZero + " ZEROS");
        } else {
            System.out.println("A matriz não é Esparsa, pois possui apenas " + contZero + " ZEROS");
        }
      
    }
  
}
