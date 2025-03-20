package atividade01_introducao_ao_java.exericio03;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	Produto(String nome, double preco, int quantidade){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}



	double calcularValorTotal() {
		
		return preco * quantidade;
	}
	
	
}
