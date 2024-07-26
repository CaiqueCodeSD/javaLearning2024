package formasGeometricas;

public class Circulo implements FiguraGeometrica{

	//atributo
	double raio;
		
	//construtor
	public Circulo(double raio) {
		this.raio = raio;
	}
		
	//método específico
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}
