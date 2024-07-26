public class Estudante {

	private String nome;
	private int idade;
	private double rendimento;
	private int periodo;
	private String curso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void mostrar() {
		
		System.out.println("O estudante " + nome + " (" + idade + " anos)" + " do curso de " + curso + " está no " + periodo + "º período com um rendimento de " + rendimento);
		
		if (periodo <= 0) {
			System.out.println("Cadastro Inválido");
		}
		
		if (rendimento <= 5) {
			int pontos = 0;
			while(rendimento < 6) {
				pontos++;
				rendimento++;
			}
			System.out.println(nome + " precisará aumentar seu rendimento em aproximadamente " + pontos + " ponto(s)");
		}
		
	}
	
}
