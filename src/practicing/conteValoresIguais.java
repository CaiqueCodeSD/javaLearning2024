import java.util.Random;
import java.util.Scanner;

public class conteValoresIguais {

    /*Construa um programa que gere e armazene em um vetor V 30 valores inteiros não negativos
    (até 10). Depois que o vetor for preenchido, o programa deve pedir para o usuário informar um
    número e mostrar quantos valores armazenados são iguais ao número informado pelo usuário.*/

    public static void main(String[] args) {

        Random crie = new Random();
        Scanner write = new Scanner(System.in);

        int[] V = new int [30];
        int contNum = 0;

        for (int i = 0; i < V.length; i++) {

            V[i] = crie.nextInt(11);
            
            System.out.println(V[i]);
          
        }

        System.out.print("Qual número gostaria de verificar? ");
        int num = write.nextInt();

        for (int i = 0; i < V.length; i++) {

            if (V[i] == num) {
                contNum++;
            }
          
        }

        System.out.println("O número " + num + " aparece " + contNum + "x");
      
    }
  
}
