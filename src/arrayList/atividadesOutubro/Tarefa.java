package arrayList.atividadesOutubro;

	/*Problema 1: Gerenciamento de Tarefas
	Crie um sistema de gerenciamento de tarefas simples. Ele deve permitir ao usuário adicionar, remover e listar as tarefas. Cada tarefa deve conter um nome e uma prioridade (baixa, média, alta).

	Requisitos:

	Crie uma classe Tarefa com os atributos nome e prioridade.
	Utilize um ArrayList<Tarefa> para armazenar as tarefas.
	Implemente as seguintes funcionalidades:
	Adicionar uma nova tarefa.
	Remover uma tarefa pelo nome.
	Exibir todas as tarefas em ordem de adição.*/

public class Tarefa {

	String nome;
	String prioridade;

	public Tarefa(String nome, String prioridade) {
		this.nome = nome;
		this.prioridade = prioridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public String toString() {
		return "Tarefa ["+ nome + ", " + prioridade + "]";
	}

}
