import java.util.Scanner;

public class calculadoraTMB {

    public static void main (String[] args) {

        /*A ideia dessa atividade é gerar uma calculadora que estima a quantidade de energia (calorias) que o corpo humano 
        necessita para realizar funções básicas de sobrevivência enquanto em repouso. Essas funções incluem respiração, circulação sanguínea, 
        manutenção da temperatura corporal, crescimento celular, entre outras atividades essenciais.

        FÓRMULAS:

        Equação de Harris-Benedict (Revisada)
        Homens: TMB = 88,362 + (13,397 × peso em kg) + (4,799 × altura em cm) - (5,677 × idade em anos)
        Mulheres: TMB = 447,593 + (9,247 × peso em kg) + (3,098 × altura em cm) - (4,330 × idade em anos)
        
        */

        Scanner read = new Scanner(System.in);

        System.out.println("CALCULADORA TMB");
        System.out.println("Qual seu sexo? [M/F] -> ");
        char sexo = read.next().charAt(0);
        char sexoMaiusc = Character.toUpperCase(sexo);

        System.out.println("Informe seu peso em KG -> ")
        double peso = read.nextDouble;

        if (sexoMaiusc != 'M' || sexoMaiusc != 'F') {
            System.out.println("Sexo inválido :/");
            break;
        }
                
        System.out.println("Sua altura em cm -> ")
        int altura = read.nextInt;

        System.out.printLn("Quantos anos você tem? -> ")
        int idade = read.nextInt;

        if (sexoMaiusc = 'M') {
            System.out.print("Sua Taxa Metabólica Basal ---> ")
            System.out.println(88,365 + (13,397 * peso) + (double)(4,799 * altura) - (double)(5,677 * idade));
        } else if (sexoMaiusc = 'F') {
            System.out.print("Sua Taxa Metabólica Basal ---> ")
            System.out.println(447,593 + (9,247 * peso) + (double)(3,098 * altura) - (double)(4,330 * idade));
        }
      
    }
  
}
