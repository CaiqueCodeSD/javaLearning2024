package arrayList;

import java.util.ArrayList;
import java.util.Random;

public class VerificarArrayList {

	public static void main(String[] args) {
		
		Random gere = new Random();
		
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		
		listaNumeros.add(gere.nextInt(11));
		listaNumeros.add(gere.nextInt(11));
		listaNumeros.add(gere.nextInt(11));
		listaNumeros.add(gere.nextInt(11));
		listaNumeros.add(gere.nextInt(11));
		listaNumeros.add(gere.nextInt(11));
		listaNumeros.add(gere.nextInt(11));
		
		if (listaNumeros.contains(7)) {
			System.out.println("O número 7 está presente na lista.");
		} else {
			System.out.println("O número 7 não aparece na lista.");
		}
		
	}
	
}
