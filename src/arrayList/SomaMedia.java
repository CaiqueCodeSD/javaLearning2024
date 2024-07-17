package arrayList;

import java.util.ArrayList;
import java.util.Random;

public class SomaMedia {

	public static void main(String[] args) {
				
		Random gere = new Random();
		
		ArrayList <Integer> listaVetor = new ArrayList();
		
		listaVetor.add(gere.nextInt(9999)+1);
		listaVetor.add(gere.nextInt(9999)+1);
		listaVetor.add(gere.nextInt(9999)+1);
		listaVetor.add(gere.nextInt(9999)+1);
		listaVetor.add(gere.nextInt(9999)+1);
		listaVetor.add(gere.nextInt(9999)+1);
		listaVetor.add(gere.nextInt(9999)+1);
		
		int soma = 0;	
		
		for (Integer integer : listaVetor) {
			soma += integer;
		}
		
		double media = (double) soma / listaVetor.size();
		
		System.out.println("Soma de todos os elementos: " + soma);
		System.out.println("Quantidade de elementos: " + listaVetor.size());
		System.out.println("Média: " + media);
		
	}
	
}
