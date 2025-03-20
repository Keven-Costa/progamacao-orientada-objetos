package atividade01_introducao_ao_java.exericio03;

public class Exercicio03 {
	public static void main(String[] args) {
		Produto produto1 = new Produto("Notebook", 5000, 3);
		Produto produto2 = new Produto("Smartphone", 3000, 5);
		
		System.out.println("Valor total em estoque do " + produto1.getNome() + ": " + produto1.calcularValorTotal());
		System.out.println("Valor total em estoque do " + produto2.getNome() + ": " + produto1.calcularValorTotal());
	}
}
