package construtor;

public class PersonagemGame {

	private String name;
	private String classe;
	private int hp;
	private int power;
	private int level;
	
	public PersonagemGame(String name, String classe, int level) {
		this.name = name;
		this.classe = classe;
		this.level = level;
		hp = level * 1000;
		
		if (classe.equals("Warrior")) {
			power = level * 3;
		} else {
			power = level;
		}
		
	}

	public void mostrarStatus() {
		System.out.format("Personagem: %s\nClasse: %s\nNível: %s\nHP ::: %s\nPoder >>> %s", 
				name, classe, level, hp, power);
	}
	
}
