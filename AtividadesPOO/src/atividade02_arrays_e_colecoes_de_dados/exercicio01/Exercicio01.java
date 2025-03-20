package atividade02_arrays_e_colecoes_de_dados.exercicio01;

// Crie um array de inteiros e calcule a soma de seus elementos.

public class Exercicio01 {

	public static void main(String[] args) {
		int[] vetor = {9, 8, 2, 5, 7};
		int resultado = 0;
	
		
		for (int numeros : vetor) {
			resultado += numeros;
		}
		
		System.out.println("O resultado da soma: " + resultado);
		
	}

}
