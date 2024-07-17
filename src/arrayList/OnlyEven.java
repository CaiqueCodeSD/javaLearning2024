package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OnlyEven {

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
		
		Collections.sort(listaVetor);
		
		listaVetor.removeIf(ind -> ind % 2 != 0);
		
		System.out.println("Printing only even numbers: ");
		
		for (Integer integer : listaVetor) {
			System.out.print(integer + "\t");
		}
		
	}
	
}
