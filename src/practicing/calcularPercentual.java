package practicing;

/*Desenvolver um programa que leia a idade de um conjunto de pessoas. Este programa
deverá calcular e mostrar: o percentual de pessoas adultas (>=18) e o percentual de pessoas
idosas (>=65). Finalize a leitura de dados com uma idade negativa.*/

import java.util.Scanner;

public class calcularPercentual {

	public static void main(String[] args) {
		
		Scanner age = new Scanner(System.in);
		
		int idade = 0;
		int cont = 0;
		int adultos = 0;
		int idosos = 0;
		
		
		while (idade >= 0) {
			System.out.print("Idade: ");
			idade = age.nextInt();
			
			if (idade >= 18) {
				adultos++;
				if (idade >= 65) {
					idosos++;
				}
			}
			cont++;
			if (idade < 0) {
				cont--;
			}
			
		}
		
		double percentualAdultos = ((double)adultos/cont)*100;
		double percentualIdosos = ((double)idosos/cont)*100;
		
		System.out.println("Percentual de pessoas adultas: " + percentualAdultos + "%");
		System.out.println("Percentual de pessoas idosas: " + percentualIdosos + "%");
		
	}
	
}
