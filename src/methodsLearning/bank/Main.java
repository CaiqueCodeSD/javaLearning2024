package bank;
public class Main {

	public static void main(String[] args) {
		
		Account cacasAccount = new Account();
		
		cacasAccount.setAccNumber("17456897");
		cacasAccount.setName("Cacá");
		cacasAccount.setEmail("caca@email");
		cacasAccount.setPhoneNumber(77889900);
		
		cacasAccount.setAccBalance(1200);
		cacasAccount.withdrawFunds(1000);
		cacasAccount.depositFunds(750);
		
		System.out.println();
		
		cacasAccount.showAccount();
		
	}
	
}
