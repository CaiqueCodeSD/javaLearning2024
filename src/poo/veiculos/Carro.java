package veiculos;

public class Carro extends Veiculo implements Eletrico{

	private int numeroDePortas;
	private int nivelBateria;

	public Carro(String marca, String modelo, int ano, int numeroDePortas) {
		super(marca, modelo, ano);
		this.numeroDePortas = numeroDePortas;
		this.nivelBateria = 100;
	}
	
	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
	
	@Override
	public void ligar() {
		System.out.println("O veículo " + getModelo() + " está ligado.\n");
	}

	@Override
	public int carregarBateria() {
		return this.nivelBateria = 98;
	}

	@Override
	public int autonomiaBateria() {
		return this.nivelBateria * 3;
	}
	
	public void mostrarDetalhes() {
		System.out.println("MARCA ::: " + getMarca());
		System.out.println("MODELO ::: " + getModelo());
		System.out.println("ANO ::: " + getAno());
		System.out.println("PORTAS ::: " + getNumeroDePortas());
		System.out.println("BATERIA ::: " + carregarBateria());
	}
	
}
