package interfaceStudy;

public class CalculadoraSimples implements BasicOperation{

		@Override
		public double addNumber(double a, double b) {
			return a + b;
		}
		
		@Override
		public double subtractNumber(double a, double b) {
		return a - b;
		}
		
		public static void main(String[] args) {
			
			CalculadoraSimples calc = new CalculadoraSimples();
			
			System.out.println("Soma -> " + calc.addNumber(15, 33));
			System.out.println("Subtração -> " + calc.subtractNumber(987, 258));
			
		}
	
}
