public class Account {

	private String number;
	private double balance;
	private String name;
	private String email;
	private String phone;
	
	public Account(String number, double balance, String name, String email, String phone) {
		System.out.println("Account constructor with parameters called");
		this.number = number;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phone = phone;

	}
	
	public void showAccount() {
		System.out.println("Account number: " + number);
		System.out.println("Username: " + name);
		System.out.println("Contacts: " + email + " / " + phone);
		System.out.println("Account balance: $" + balance);
	}
	
}
