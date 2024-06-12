/*Gere uma matriz 20x7 que representa a quantidade de produtos vendidos (0 a 100) de 20
produtos em uma determinada semana (cada coluna representa um dia na semana (0 –
domingo, 1 – segunda, .....)). A seguir, informe:
- o produto com mais venda na semana;
- o produto com mais venda no fim de semana (sábado e domingo);
- adicione em um vetor V as vendas dos produtos de segunda à quarta (3 dias
acumulados);*/

import java.util.Random;

public class vendasNaSemana {

    public static void main(String[] args){

        Random quantidade = new Random();
      
        int[][] vendas = new int[20][7];
        int maisVendidoSemana = 0;
        int vendidoSemanaPosicao = 0;
        int maisVendidoFDS = 0;
        int vendidoFDSPosicao = 0;

        for (int i = 0; i < 20; i++) {
            int totalVendas = 0;
            for (int j = 0; j < 7; j++) {
                vendas[i][j] = quantidade.nextInt(101);
                System.out.print(vendas[i][j] + "\t");
                totalVendas += vendas[i][j];
            }
            System.out.println();

            if (totalVendas > maisVendidoSemana) {
                maisVendidoSemana = totalVendas;
                vendidoSemanaPosicao = i;
            }

            int totalVendasFDS = vendas[i][0] + vendas[i][6];
            if (totalVendasFDS > maisVendidoFDS) {
                maisVendidoFDS = totalVendasFDS;
                vendidoFDSPosicao = i;
            }
        }

        System.out.println("Produto mais vendido na semana -> " + (vendidoSemanaPosicao+1));
        System.out.println("Produto mais vendido no FDS -> " + (vendidoFDSPosicao+1));

        System.out.println("Vendas dos produtos de segunda à quarta:");
        for (int i = 0; i < 20; i++) {
            int vendasSegQua = vendas[i][1] + vendas[i][2] + vendas[i][3];
            System.out.println("Prod. " + (i+1) + " -> " + vendasSegQua);
        }
    }
}
}
