/*Elabore um programa para controlar o esporte e time preferido de um conjunto de
pessoas. O programa deverá ler o esporte preferido (F - Futebol, V - Vôlei, B - Basquete), o time
que o mesmo torce e o sexo (F, M) do entrevistado. O programa deverá ser encerrado com o
esporte “Z”. A seguir, informe: o percentual de preferência do futebol; o percentual das
mulheres que preferem vôlei e o percentual de pessoas, dentre os que preferem futebol, que
torcem pelo RMD.*/

import java.util.Scanner;

public class esporteFavorito {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Quantas pessoas participarão da pesquisa?");
        int quant = read.nextInt();

        while (esporte != 'Z') {

            System.out.print("ESPORTE FAVORITO -> ");
            char esporte = read.next().charAt(0);
            char esporteMaiusc = Character.toUpperCase(esporte);

            System.out.println("SEXO DO ENTREVISTADO -> ");
            char sexo = read.next().charAt(0);
            char sexoMaiusc = Character.toUpperCase(sexo);

            
            
        }
      
    }
  
}
