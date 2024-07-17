package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CreateArrayList {

	public static void main(String[] args) {
				
		Random gere = new Random();
		
		ArrayList <Integer> listaVetor = new ArrayList(10);
		
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
		
		for (Integer integer : listaVetor) {
			System.out.println(integer);
		}
		
	}
	
}
