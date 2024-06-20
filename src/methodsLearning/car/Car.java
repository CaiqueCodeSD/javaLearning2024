package car;

public class Car {

	private String make = "Tesla";
	private String model = "Model X";
	private String color = "Black";
	private int doors = 2;
	private boolean convertible = true;
	
	//shortcut = Source --> Generate Getters and Setters
	//Getters
	public String getMake() {
		return make;
	}
	
	
	
	public String getModel() {
		return model;
	}



	public int getDoors() {
		return doors;
	}


	//Setters
	public void setModel(String model) {
		this.model = model;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public void setDoors(int doors) {
		this.doors = doors;
	}


 
	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	
	//here I've vuilt a rule that I'm supporting only three manufacturers
	public void setMake(String make) {
		if (make == null) make = "Unknown";
		String lowercaseMake = make.toLowerCase();
		switch (lowercaseMake) {
		case "holden","porsche","tesla" -> this.make = make;
		default -> {
			this.make = "Unsupported";
		}
		}
		
	}
	
	

	public void describeCar() {
		
		System.out.println(doors + " Door / " + color + " / " + make + " / " + model + " / " + convertible);
		
	}
	
}
