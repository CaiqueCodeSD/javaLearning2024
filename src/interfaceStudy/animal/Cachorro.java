package interfaceStudy.animal;

public class Cachorro implements Animal{
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro faz AU");
	}

	@Override
	public void idade() {
		System.out.println("O cachorro tem 10 anos");
	}

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		
		dog.emitirSom();
		dog.idade();
		
	}
  
}
