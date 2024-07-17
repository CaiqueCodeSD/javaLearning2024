package arrayList;

import java.util.ArrayList;

public class Produto {

	String nome;
	double preco;
	
	public Produto (String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Produto> produto = new ArrayList<Produto>();
		produto.add(new Produto("Gabinete", 450.15));
		produto.add(new Produto("Teclado", 110.99));
		produto.add(new Produto("Mouse", 80.75));
		produto.add(new Produto("Monitor", 1100.20));
		produto.add(new Produto("Placa de Vídeo", 800));
		
		double soma = 0;
		for (Produto produto2 : produto) {
			soma += produto2.getPreco();
		}
		
		for (Produto prod : produto) {
			System.out.println(prod.getNome() + " custa R$" + prod.getPreco());
		}
		
		System.out.println("\nValor total ::: R$" + soma);
		
	}
	
}
