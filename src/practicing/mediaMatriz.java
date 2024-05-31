/*Elabore um programa que gere uma matriz 4x4. Os números devem ser gerados no
intervalo de 0 a 20. A seguir, informe:
- média dos elementos da matriz abaixo de 5;
- adicione em um Vetor V, os elementos da matriz acima da média;*/

import java.util.Random;

public class mediaMatriz {

    public static void main (String[] args) {

        Random gerar = new Random();

        int[][] M = new int[4][4];
        int[] V = new int[16];

        int somaAbaixo5 = 0;
        int contAbaixo5 = 0;
        int contV = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                M[i][j] = gerar.nextInt(21);
                System.out.print(M[i][j] + "\t");

                if (M[i][j] <= 5) {
                    somaAbaixo5 += M[i][j];
                    contAbaixo5++;
                }
                
            }
            System.out.println();
        }
        
        double media = (double)somaAbaixo5/contAbaixo5;
        
        System.out.println("Média dos elementos abaixo de 5 -> " + media);
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (M[i][j] >= media) {
                    V[contV++] = M[i][j];
                }
                
            }

        }
        
        System.out.print("Elementos da Matriz que estão acima da média (" + media + ") -> ");
        
        for (int i = 0; i < contV; i++) {
        	System.out.print(V[i] + "\t");
        }
      
    }
  
}
