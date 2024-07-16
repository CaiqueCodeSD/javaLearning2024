package jogoInterface;

public class PC {
	
	private Jogo jogo;
	private boolean estaLigado;

	public void ligar() {
		System.out.println("Iniciando o sistema...");
		this.estaLigado = true;
	}
	
	public void jogar(Jogo jogo) {
		if (estaLigado == true) {
			System.out.println("Abrindo a biblioteca de jogos");
			System.out.println("Carregando o jogo...\n");
			this.jogo = jogo;
			jogo.jogar();
		} else {
			System.out.println("O PC está desligado");
		}
		
	}
	
	public void fechar() {
		
		if (estaLigado == true) {	
			System.out.println("\nEncerrando o sistema");
			} else {
			System.out.println("O PC já está desligado");
		}
		
	}
	
}
