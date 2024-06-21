package bank;

public class Account {
	
	private String accNumber;
	private double accBalance;
	private String name;
	private String email;
	private int phoneNumber;
	
	public void depositFunds(double depositAmount) {
		accBalance += depositAmount;
		System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.accBalance);
	}
	
	public void withdrawFunds(double withdrawAmount) {
		if (accBalance - withdrawAmount < 0) {
			System.out.println("Insuficient Funds! You only have $" + accBalance);
		} else {
		accBalance -= withdrawAmount;
		System.out.println("Withdrawal of $" + withdrawAmount + " processed. Remaining balance is $" + this.accBalance);
		}
	}
	
	public void showAccount() {
		System.out.println("Account number: " + accNumber);
		System.out.println("Username: " + name);
		System.out.println("Contacts: " + email + " / " + phoneNumber);
		System.out.println("Account balance: $" + accBalance);
	}
	
	public String getAccNumber() {
		return accNumber;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
