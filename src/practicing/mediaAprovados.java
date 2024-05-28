import java.util.Random;

public class mediaAprovados {
  
/*Ler um vetor M com as médias finais de uma turma de 8 alunos. A seguir, calcule a média
aritmética dos alunos aprovados (média maior ou igual a 6). Armazene em um vetor A, os índices
que cada aluno ocupa no vetor M dos alunos que obtiveram média maior ou igual que a média da
turma.*/

    public static void main (String[] args) {

        Random gerar = new Random();
      
        int[] M = new int[8];

        for (int i = 0; i < M.length; i++) {

            M[i] = gerar.nextInt(11);
          
        }
      
    }
  
}
