package car;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		//using Setters
		car.setMake("FIAT");
		car.setModel("TORO");
		car.setColor("White");
		car.setConvertible(false);
		car.setDoors(4);
		
		//using Getters
		System.out.println("make -> " + car.getMake());
		
		car.describeCar();
		
		//new object
		Car volks = new Car();
		volks.setMake("Tesla");
		volks.setModel("X");
		volks.setColor("Gray");
		volks.setConvertible(true);
		volks.setDoors(2);
		volks.describeCar();
		
	}
	
}
