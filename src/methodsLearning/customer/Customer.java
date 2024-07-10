package card;

public class Customer {

	private String name;
	private double creditLimit;
	private String emailAdress;
	
	public Customer() {
		this("Aba","ab@abaemail");
	}
	
	public Customer(String name, String emailAdress) {
		this(name, 1000, emailAdress);
	}



	public Customer(String name, double creditLimit, String emailAdress) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAdress = emailAdress;
	}



	public String getName() {
		return name;
	}


	public double getCreditLimit() {
		return creditLimit;
	}


	public String getEmailAdress() {
		return emailAdress;
	}

	
	public void showCustomer() {
		System.out.println("Name: " + name);
		System.out.println("Credit Card Limit: $" + creditLimit);
		System.out.println("Email: " + emailAdress);
	}
	
}
