package veiculos;

public class Main {

	public static void main(String[] args) {
		
		Carro carro = new Carro("FIAT", "Toro", 2021, 4);
		carro.mostrarDetalhes();
		carro.ligar();
		
		Motocicleta motocicleta = new Motocicleta("Honda", "Pop 100", 2016);
		motocicleta.mostrarDetalhes();
		motocicleta.ligar();
		
		Caminhao caminhao = new Caminhao("EURO", "Truck", 2024, 750);
		caminhao.mostrarDetalhes();
		caminhao.ligar();
	}
	
}
