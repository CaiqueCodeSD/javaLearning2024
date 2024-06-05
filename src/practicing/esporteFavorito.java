/*Elabore um programa para controlar o esporte e time preferido de um conjunto de
pessoas. O programa deverá ler o esporte preferido (F - Futebol, V - Vôlei, B - Basquete), o time
que o mesmo torce e o sexo (F, M) do entrevistado. O programa deverá ser encerrado com o
esporte “Z”. A seguir, informe: o percentual de preferência do futebol; o percentual das
mulheres que preferem vôlei e o percentual de pessoas, dentre os que preferem futebol, que
torcem pelo time 1.*/

import java.util.Scanner;

public class esporteFavorito {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);
        
        char esporteMaiusc = 'A';
        int entrevistado = 0;
        
        System.out.println("ESPORTES");
        System.out.println("[F] FUTEBOL - [V] Vôlei - [B] Basquete");
        System.out.println("TIMES (de 1 a 10)");

        while (esporteMaiusc != 'Z') {
        	
        	System.out.println("Entrevistado " + (entrevistado +1) + ": ");

            System.out.print("ESPORTE FAVORITO -> ");
            char esporte = read.next().charAt(0);
            esporteMaiusc = Character.toUpperCase(esporte);
            
			if (esporteMaiusc == 'Z') {
				System.out.println("PROGRAMA ENCERRADO");
				System.exit(0);
			}
			      

            System.out.print("SEXO DO ENTREVISTADO -> ");
            char sexo = read.next().charAt(0);
            char sexoMaiusc = Character.toUpperCase(sexo);
            
            if (sexoMaiusc != 'M' && sexoMaiusc != 'F') {
				System.out.println("SEXO INVÁLIDO");
			}

            System.out.print("TORCE PARA O TIME -> ");
            int time = read.nextInt();
            
            System.out.println();
            
            entrevistado++;
            
        }
      
    }
  
}
