/*Escreva um programa em Java que encontre e imprima o maior elemento em uma matriz 5x5.*/

import java.util.Random;
import java.util.Scanner;

public class maiorElemento {

    public static void main(String[] args) {

        Scanner tamanho = new Scanner(System.in);
        Random gere = new Random();

        System.out.print("Qual o tamanho da matriz? ");
        int tam = tamanho.nextInt();
      
        int[][] M = new int[tam][tam];
        int maior = 0;
        
        System.out.println();

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = gere.nextInt(10001);

                if (M[i][j] > maior) {
                    maior = M[i][j];
                }
              
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Maior elemento da matriz: " + maior);
      
    }
  
}
