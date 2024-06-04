/*Em formato de menu, crie um programa para escolher uma figura geométrica plana (R, C,
Q) e calcular a área da figura escolhida. Ao escolher o retângulo (R), o usuário
deve informar o lado e altura. Ao escolher o círculo (C), o usuário deve informar o raio. Ao
escolher quadrado (Q), o usuário deve escolher o lado. O sistema deve ser encerrado quando
escolher a figura 'Z'*/

import java.util.Scanner;

public class figurasGeometricas {

    public static void main (String[] args) {

        Scanner shape = new Scanner(System.in);

        System.out.println("CALCULAR FIGURAS GEOMÉTRICAS");
        System.out.println("Rentângulo (R)");
        System.out.println("Quadrado (Q)");
        System.out.println("Círculo (C)");

        System.out.println();
        System.out.print("QUAL FIGURA DESEJA CALCULAR? -> ");
        char forma = shape.next().charAt(0);
        char formaMaiusc = Character.toUpperCase(forma);
        
      
        while (formaMaiusc != 'Z') {
            
	        switch (formaMaiusc) {
	     	case 'R': 
	     		 System.out.println("INSIRA OS VALORES: ");
	     	     System.out.print("Altura -> ");
	     		 double a = shape.nextDouble();
	     		 System.out.print("Base -> ");
	     		 double b = shape.nextDouble();
	     		 System.out.println("Área do retângulo: " + (a*b));
	     		 System.out.println();
	     			  break;
	     	 case 'C':
	     		 System.out.println("INSIRA OS VALORES: ");
	             System.out.print("Informe o raio -> ");
	             double raio = shape.nextDouble();
	             double areaCirculo = Math.PI * Math.pow(raio, 2);
	             double perimetroCirculo = 2 * Math.PI * raio;
	             System.out.println("Área do círculo -> " + (Math.PI * Math.pow(raio, 2)));
	             System.out.println();
	             break;
	         case 'Q':
	     		 System.out.println("INSIRA OS VALORES: ");
	             System.out.print("Informe o lado -> ");
	             double lado = shape.nextDouble();
	             System.out.println("Área do quadrado -> " + (lado * lado));
	             System.out.println();
	             break;
	         case 'Z':
	             System.out.println("[PROGRAMA ENCERRADO]");
	             break;
	         default:
	             System.out.println("Opção inválida!");
	             System.out.println();
	     		 break;
	     		}
	        
	        System.out.print("QUAL FIGURA DESEJA CALCULAR? -> ");
            forma = shape.next().charAt(0);
            formaMaiusc = Character.toUpperCase(forma);
            
        }
        
    }
  
}
