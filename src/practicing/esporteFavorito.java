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
        int contFutebol = 0;
        double preferemFutebol = 0;
        int contMulher = 0;
        int mulherVolei = 0;
        double preferemVoleiMulheres = 0;
        int torceTimeUm = 0;
        double percentualTimeUm= 0;
        
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
		break;
	    }
			
	    if (esporteMaiusc == 'F') {
		contFutebol++;
	    }      

            System.out.print("SEXO DO ENTREVISTADO -> ");
            char sexo = read.next().charAt(0);
            char sexoMaiusc = Character.toUpperCase(sexo);
            
            if (sexoMaiusc != 'M' && sexoMaiusc != 'F') {
		System.out.println("SEXO INVÁLIDO");
	    }
            
            if (sexoMaiusc == 'F') {
	        if (esporteMaiusc == 'V') {
	            mulherVolei++;
	        }
	        contMulher++;
            }

            System.out.print("TORCE PARA O TIME -> ");
            int time = read.nextInt();
            
            if (esporteMaiusc == 'F' && time == 1) {
            	torceTimeUm++;
            }
            
            System.out.println();
            
            entrevistado++;
            
        }

        preferemFutebol = contFutebol/(double)(entrevistado+1);
        preferemVoleiMulheres = mulherVolei/(double)contMulher;
        percentualTimeUm = torceTimeUm/(double)contFutebol;
        
        System.out.println();
        
        System.out.println("PERCENTUAL QUE PREFERE FUTEBOL -> " + preferemFutebol*100 + "%");
        System.out.println("PERCENTUAL DAS MULHERES QUE PREFEREM VÔLEI -> " + preferemVoleiMulheres*100 + "%");
        System.out.println("PERCENTUAL DOS QUE PREFEREM FUTEBOL E TORCEM PRO TIME 1 -> " + percentualTimeUm*100 + "%");

    }
  
}
