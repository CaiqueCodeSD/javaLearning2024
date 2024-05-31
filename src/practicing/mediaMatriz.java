/*Elabore um programa que gere uma matriz 4x4. Os números devem ser gerados no
intervalo de 0 a 20. A seguir, informe:
- média dos elementos da matriz abaixo de 5;
- adicione em um Vetor V, os elementos da matriz acima da média;*/

import java.util.Random;

public class mediaMatriz {

    public static void main (String[] args) {

        Random gerar = new Random();

        int[][] M = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                M[i][j] = gere.nextInt(21);
                System.out.print(M[i][j] + "\t")
            }
            System.out.println();
        }
      
    }
  
}
