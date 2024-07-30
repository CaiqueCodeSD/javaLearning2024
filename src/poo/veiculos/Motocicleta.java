package veiculos;

public class Motocicleta extends Veiculo {

	public Motocicleta(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}
	
	@Override
	public void ligar() {
		System.out.println("A moto " + getModelo() + " está ligada.\n");
	}
	
	public void mostrarDetalhes() {
		System.out.println("MARCA ::: " + getMarca());
		System.out.println("MODELO ::: " + getModelo());
		System.out.println("ANO ::: " + getAno());
	}
		
}
