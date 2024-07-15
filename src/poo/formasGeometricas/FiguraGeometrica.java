package formasGeometricas;

public class Quadrado implements FiguraGeometrica{
	
	//atributo
	int lado;
	
	//construtor
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	//método específico
	public double calcularArea() {
		return Math.pow(lado, 2);
	}

	//getters e setters
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
}
