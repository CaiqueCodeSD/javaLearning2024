/*Escreva um programa em Java que some duas matrizes de tamanho 3x3 e armazene o resultado em uma terceira matriz.*/

import java.util.Random;

public class terceiraMatriz {

    public static void main(String[] args) {

        Random gere = new Random();

        int[][] M1 = new int[3][3];
        int[][] M2 = new int[3][3];
        int[][] M3 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                M1[i][j] = gere.nextInt(10001);
                System.out.print(M1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                M2[i][j] = gere.nextInt(10001);
                System.out.print(M2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                M3[i][j] = M1[i][j] + M2[i][j];
                System.out.print(M3[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
  
}
