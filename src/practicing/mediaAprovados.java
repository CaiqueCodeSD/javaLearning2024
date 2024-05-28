import java.util.Random;

public class mediaAprovados {
  
/*Gerar um vetor M com as médias finais de uma turma de 8 alunos. A seguir, calcule a média
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

        double mediaTurma = (double)mediasAprovados/contAprovados;
        int cont = 0;
        
        for (int i = 0; i < M.length; i++) {
        	
        	if (M[i] >= mediaTurma) {
        		A[cont++] = i;
        	}
        	
        }
        
        System.out.println();
        System.out.println("Média dos alunos aprovados: " + mediaTurma);

        System.out.print("Índices com notas >= Média da Turma: ");
        
        for (int i = 0; i < cont; i++) {

            System.out.print(A[i] + "\t");
          
        }
      
    }
  
}
