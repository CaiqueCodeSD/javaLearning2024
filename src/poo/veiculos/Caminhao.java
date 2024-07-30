package veiculos;

public class Caminhao extends Veiculo {
	
	private int capacidadeCarga;

	public Caminhao(String marca, String modelo, int ano, int capacidadeCarga) {
		super(marca, modelo, ano);
		this.capacidadeCarga = capacidadeCarga;
	}
	
	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public void mostrarDetalhes() {
		System.out.println("MARCA ::: " + getMarca());
		System.out.println("MODELO ::: " + getModelo());
		System.out.println("ANO ::: " + getAno());
		System.out.println("CAPACIDADE CARGA ::: " + getCapacidadeCarga() + "KG");
	}
	
}
