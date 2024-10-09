package arrayList.atividadesOutubro;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Tarefa tarefa = new Tarefa(null, null);
		ArrayList<String> tarefas = new ArrayList<>();
		
		MenuGerenciadorTarefas.mostrarMenu();
		int opcao = entrada.nextInt();
		
		while (opcao > 0) {
			switch (opcao) {
			case 1:
				System.out.print("Nome da tarefa: ");
				String nome = entrada.next();
				tarefa.setNome(nome);
				System.out.print("Prioridade da tarefa: ");
				String prioridade = entrada.next();
				tarefa.setNome(prioridade);
				
				tarefas.add(nome);
				
				break;

			default:
				break;
			}
			MenuGerenciadorTarefas.mostrarMenu();
			opcao = entrada.nextInt();
		}
		
		System.out.println(tarefas);
		
	}
	
}
