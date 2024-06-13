/*Escreva um programa em Java que transponha uma matriz 3x3 (troque linhas por colunas).*/

import java.util.Random;

public class transporMatriz {
	
	public static void main(String[] args) {
		
		 Random gere = new Random();

	        int[][] M1 = new int[3][3];
	        int[][] M2 = new int[3][3];

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
	                M2[i][j] = M1[j][i];
	                System.out.print(M2[i][j] + "\t");
	            }
	            System.out.println();
	        }
		
	}

}
