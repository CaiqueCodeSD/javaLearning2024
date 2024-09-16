package arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class OrganizandoArrayList {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		ArrayList<Integer> listaOrganizar = new ArrayList<>();
		
		listaOrganizar.add(random.nextInt(10001));
		listaOrganizar.add(random.nextInt(10001));
		listaOrganizar.add(random.nextInt(10001));
		listaOrganizar.add(random.nextInt(10001));
		listaOrganizar.add(random.nextInt(10001));
		listaOrganizar.add(random.nextInt(10001));
		listaOrganizar.add(random.nextInt(10001));	

		Collections.sort(listaOrganizar);
		
		System.out.println(listaOrganizar);
		
	}
	
}
