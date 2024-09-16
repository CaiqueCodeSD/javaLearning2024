package arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class JuntandoArrayList {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		ArrayList<Integer> lista1 = new ArrayList<>();
		
		lista1.add(random.nextInt(10001));
		lista1.add(random.nextInt(10001));
		lista1.add(random.nextInt(10001));
		lista1.add(random.nextInt(10001));
		lista1.add(random.nextInt(10001));
		lista1.add(random.nextInt(10001));
		lista1.add(random.nextInt(10001));
		
		ArrayList<Integer> lista2 = new ArrayList<>();

		lista2.add(random.nextInt(1001));
		lista2.add(random.nextInt(1001));
		lista2.add(random.nextInt(1001));
		lista2.add(random.nextInt(1001));
		lista2.add(random.nextInt(1001));
		lista2.add(random.nextInt(1001));
		lista2.add(random.nextInt(1001));
		
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		
		lista3.addAll(lista1);
		lista3.addAll(lista2);
		Collections.sort(lista3);

		System.out.println(lista3);
		
	}
	
}
