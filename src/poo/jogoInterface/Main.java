package jogoInterface;

public class Main {

	public static void main(String[] args) {
		
		PC CPUPrime = new PC();
		CPUPrime.ligar();
		CPUPrime.jogar(new BatmanArkham());
		CPUPrime.fechar();
		
	}
	
}
