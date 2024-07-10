import java.util.Random;

public class Personagem {

	String nome;
	int poder;
	int nivel;
	
	void mostrarValores() {
		System.out.format("Personagem %s com %s de poder / Nível >>> %d \n", nome, poder, nivel);
	}
	
	int calcularDano() {
		Random gerador = new Random();
		int dado20Faces = 1 + gerador.nextInt(19); //desse modo vai começar do 1
		int dano = poder + dado20Faces;
		return dano;    
	}
	
	void atacar(String alvo, String habilidade) {
		int danoCausado = calcularDano();
		if (habilidade.length() == 0) {
			System.out.format("%s atacou %s e causou %s de dano. \n", nome, alvo, danoCausado);			
		} else {
			System.out.format("%s usou %s contra %s e causou %s de dano. \n", 
					nome, habilidade, alvo, danoCausado);
		}
	}
	
	int item() {
		Random gerar = new Random();
		int drop = gerar.nextInt(2);
		return drop;
	}
	
	void dropItem() {
		if (item() > 0) {
			Random esm = new Random();
			int esmeraldas = 1 + esm.nextInt(9999);

			System.out.format("%s recebeu um baú com %s esmeraldas. \n", nome, esmeraldas);
		} else {
			System.out.format("%s não recebeu recompensas especiais. \n", nome);
		}
	}
	
}
