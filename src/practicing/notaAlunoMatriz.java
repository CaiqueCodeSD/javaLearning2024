/*Elabore um programa que leia uma Matriz M (4x3) que representa as 03 notas de 04 estudantes
(cada linha representa um aluno e cada coluna representa uma nota). A seguir, adicione em
Vetor V, a média das notas de cada aluno.*/

import java.util.Random;

public class notaAlunoMatriz {

    public static void main (String[] args) {

        Random gere = new Random();
        
        int[][] M = new int[4][3];
        double[] V = new double[4]; 
        

        for (int i = 0; i < 4; i++) {
            System.out.print("Estudante [" + (i + 1) + "] -> " + "\t");
            for (int j = 0; j < 3; j++) {
                M[i][j] = gere.nextInt(11);
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
           
            for (int j = 0; j < 3; j++) {
            	 V[i] += M[i][j];
            }
            V[i] = (V[i]/3);
        }

        System.out.println();
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Média Estudante [" + (i + 1) + "] -> " + "\t");
            System.out.println(V[i] + "\t");
        }
      
    }
  
}
