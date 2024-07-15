package formasGeometricas;

public class CalculadorAreaFiguras {
	
	public double somarAreas(FiguraGeometrica quadrado, FiguraGeometrica circulo) {
		
		double totalArea = quadrado.calcularArea() + circulo.calcularArea();
		return totalArea;
		
	}

}
