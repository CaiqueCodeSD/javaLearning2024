package pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Wayne");
		pessoa1.setIdade(38);
		pessoa1.setAltura(1.96);
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getAltura());
		
	}
	
}
