package formasGeometricas;

public class Main {
	
	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado(3);
		System.out.println(quadrado.calcularArea());
		
		Circulo circulo = new Circulo(9);
		System.out.println(circulo.calcularArea());
		
		CalculadorAreaFiguras somarArea = new CalculadorAreaFiguras();
		System.out.println(somarArea.somarAreas(circulo, circulo));
		
	}

}
