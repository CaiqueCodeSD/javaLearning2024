package personagem;

public class Main {

	public static void main(String[] args) {
		
		Personagem tanque = new Personagem();
		
		tanque.nome = "Aslam";
		tanque.poder = 963;
		tanque.nivel = 11;
		
		tanque.mostrarValores();
		
		tanque.atacar("Bruxa", "Faith");

		System.out.println(tanque.calcularDano());
		
		tanque.dropItem();
		
	}
	
}
