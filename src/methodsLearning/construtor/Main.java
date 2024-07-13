package construtor;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog(null, "Nome do personagem: ");
		String classe = JOptionPane.showInputDialog(null, "Classe do personagem: ");
		
		PersonagemGame personagem = new PersonagemGame(name, classe, 12);
		
		personagem.mostrarStatus();
		
	}
	
}
