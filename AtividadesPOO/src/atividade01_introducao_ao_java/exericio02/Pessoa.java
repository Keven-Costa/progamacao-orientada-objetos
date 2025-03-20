package atividade01_introducao_ao_java.exericio02;

public class Pessoa {
	private String nome;
	private int idade;
	
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}


	void mostrarInformacoes() {
		System.out.println("Nome: "  + getNome());
		System.out.println("Idade: " + getIdade());
	}

}
