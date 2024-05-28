import java.util.Random;

public class mediaAprovados {
  
/*Ler um vetor M com as médias finais de uma turma de 8 alunos. A seguir, calcule a média
aritmética dos alunos aprovados (média maior ou igual a 6). Armazene em um vetor A, os índices
que cada aluno ocupa no vetor M dos alunos que obtiveram média maior ou igual que a média da
turma.*/

    public static void main (String[] args) {

        Random gerar = new Random();
      
        int[] M = new int[8];
        int mediasAprovados = 0;
        int contAprovados = 0;

        int[] A = new int[8];

      
        for (int i = 0; i < M.length; i++) {

            M[i] = gerar.nextInt(11);
            System.out.print(M[i] + "\t");

            if (M[i] >= 6) {
                mediasAprovados += M[i];
                contAprovados++;
            }
          
        }

        
        for (int i = 0; i < M.length; i++) {
            int cont = 0;
            if (M[i] >= 6) {
                A[cont++] = i;
            }
          
        }

        System.out.println("Média dos alunos aprovados: " + (double)mediasAprovados/contAprovados);

        for (int i = 0; i < contAprovados; i++) {

            System.out.println(A[i]);
          
        }
      
    }
  
}
