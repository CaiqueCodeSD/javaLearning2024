package computer;

import java.time.LocalDate;

public class Computer {
	
	public int amountRAM;
	public String operatingSystem;
	public int storageSSD;
	public int monitorSize;
	
	public Computer(int amountRAM, String operatingSystem, int storageSSD, int monitorSize) {
		this.amountRAM = amountRAM;
		this.operatingSystem = operatingSystem;
		this.storageSSD = storageSSD;
		this.monitorSize = monitorSize;
	}
	
	public void showSpecs() {
		LocalDate date = LocalDate.now();

		System.out.println("SYSTEM ::::::: " + operatingSystem);
		System.out.println("RAM INSTALLED ::::::: " + amountRAM);
		System.out.println("SSD SIZE ::::::: " + storageSSD);
		System.out.println("MONITOR SIZE ::::::: " + monitorSize);
		System.out.println("CURRENT DATE ::::::: " + date  + "\n");
		
	}
	
	public void bootingUp(boolean isON) {
		if (isON == true) {
			System.out.println("Power ON");
			System.out.println("The PC is starting...");
		} else {
			System.out.println("The PC is power OFF");
		}
		
	}
	
	public void shuttingDown(boolean off) {
		if (off == true) {
			System.out.println("Power OFF");
		} else {
			System.out.println("The PC keeps working");
		}
	}
	
	public void beeping(boolean beep) {
		if (beep == true) {
			System.out.println("The PC is beeping");
		} else {
			System.out.println("The PC isn't beeping");
		}
	}
	
	public void openBrowser(String browser) {
		System.out.format("Opening %s... \n", browser);
	}
	
	public static void main(String[] args) {
				
		Computer computer = new Computer(32, "Linux", 1000, 24);
		
		computer.showSpecs();
		computer.bootingUp(true);
		computer.beeping(false);
		computer.openBrowser("OpenSource");
		computer.shuttingDown(true);
		
	}
	
}
