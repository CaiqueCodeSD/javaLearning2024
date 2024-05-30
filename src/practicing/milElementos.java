import java.util.Random;

public class milElementos {

    /*Elabore um programa que preencha aleatoriamente um vetor de 1000 elementos inteiros no
    intervalo de 0 a 20. Em seguida, informe o número de ocorrências de cada um dos casos possíveis.*/
  
    public static void main (String[] args) {

        Random hundred = new Random();
      
        int[] mil = new int[1000];
        int[] possibilidades = new int[21];
      
        for (int i = 0; i < mil.length; i++) {
            mil[i] = hundred.nextInt(21);
        }

        for (int i = 0; i < mil.length; i++) {
            possibilidades[mil[i]]++;
        }

        for (int i = 0; i < possibilidades.length; i++) {
            System.out.println(i + " aparece " + possibilidades[i] + "x");
        }
      
    }
  
}
