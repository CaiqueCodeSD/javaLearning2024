package card;

public class Main {

	public static void main(String[] args) {
		
		Customer aslamCustomer = new Customer("Aslam", 5000, "asl@maslam");
		aslamCustomer.showCustomer();
		
		System.out.println();
		
		Customer abaCustomer = new Customer();
		abaCustomer.showCustomer();
		
	}
	
}
