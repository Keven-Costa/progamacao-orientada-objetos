package atividade03_revisao_final.exercicio05;


// : Implemente um programa que percorra um array de inteiros e exiba apenas os números pares.


public class Exercicio05 {

	public static void main(String[] args) {
		int[] numerosInteiros = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Valores do vetor: ");
		for (int i : numerosInteiros) {
			System.out.println(i);
		}
		
		System.out.println("Valores pares do vetor");
		for (int i : numerosInteiros) {
			if ( i % 2 == 0 ) {
				System.out.println(i);
			}
		}
	}

}
