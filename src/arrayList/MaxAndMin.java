package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MaxAndMin {

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
		listaVetor.add(gere.nextInt(9999)+1);
		listaVetor.add(gere.nextInt(9999)+1);
		listaVetor.add(gere.nextInt(9999)+1);
		listaVetor.add(gere.nextInt(9999)+1);
		
		for (Integer integer : listaVetor) {
			System.out.print(integer + "\t");
		}
		
		int maxValue = Collections.max(listaVetor);
		int minValue = Collections.min(listaVetor);
		
		System.out.println("\n");
		System.out.println("MAX: " + maxValue);
		System.out.println("MIN: " + minValue);
		
	}
	
}
