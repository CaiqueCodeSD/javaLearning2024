package arrayList;

import java.util.*;

public class InterseccaoArrayList {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		
		lista1.add(random.nextInt(11));
		lista1.add(random.nextInt(11));
		lista1.add(random.nextInt(11));
		lista1.add(random.nextInt(11));
		lista1.add(random.nextInt(11));
		lista1.add(random.nextInt(11));
		lista1.add(random.nextInt(11));
		
		System.out.println("Lista 1 = " + lista1);
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>(); 

		lista2.add(random.nextInt(11));
		lista2.add(random.nextInt(11));
		lista2.add(random.nextInt(11));
		lista2.add(random.nextInt(11));
		lista2.add(random.nextInt(11));
		lista2.add(random.nextInt(11));
		lista2.add(random.nextInt(11));		
		
		System.out.println("Lista 2 = " + lista2);
		
		ArrayList<Integer> interseccao = new ArrayList<Integer>(lista1); 

		interseccao.retainAll(lista2);
		
		System.out.println("Interseção = " + interseccao);
		
	}
	
}
