import java.util.Random;

public class cincoVetores {

    /*- Gere a idade de 10 pessoas e armazene em um vetor V. A seguir, crie 04 vetores:
- adicione em um vetor P as idades pares;
- adicione em um vetor I as idades ímpares;
- adicione em um vetor AP as idades maiores que 18 anos a partir do vetor P;
- adicione em um vetor AI as idades maiores que 18 anos a partir do vetor I;*/

    public static void main (String[] args) {

        Random idade = new Random();

        int[] V = new int [10];
        int[] P = new int [10];
        int[] I = new int [10];
        int[] AP = new int [10];
        int[] AI = new int [10];

        int contP = 0;
        int contI = 0;
        int contAP = 0;
        int contAI = 0;

        System.out.print("Idades: ");
      
        for (int i = 0; i < V.length; i++) {

            V[i] = idade.nextInt(30);
            System.out.print(V[i] + "\t");

            if (V[i] % 2 == 0) {
                P[contP++] = V[i];
            } else {
                I[contI++] = V[i];
            }
          
        }

        System.out.println();
        System.out.println();
        System.out.print("Idades Pares -> ");

        for (int i = 0; i < contP; i++) {
            System.out.print(P[i] + "\t");
            if (P[i] >= 18) {
                AP[contAP++] = P[i];
            }
          
        }

        System.out.println();
        System.out.println();
        System.out.print("Idades Ímpares -> ");

        for (int i = 0; i < contI; i++) {
            System.out.print(I[i] + "\t");
            if (I[i] >= 18) {
                AI[contAI++] = I[i];
            }
          
        }

        System.out.println();
        System.out.println();
        System.out.print("Idades Maiores/Iguais 18 e Pares -> ");

        for (int i = 0; i < contAP; i++) {

            System.out.print(AP[i] + "\t");
          
        }

        System.out.println();
        System.out.println();
        System.out.print("Idades Maiores/Iguais 18 e Ímpares -> ");

        for (int i = 0; i < contAI; i++) {

            System.out.print(AI[i] + "\t");
          
        }
          
    }
  
}
