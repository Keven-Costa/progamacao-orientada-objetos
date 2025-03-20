package atividade02_arrays_e_colecoes_de_dados.exercicio03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Crie um conjunto de números inteiros e remova todos os números pares.

public class Exercicio03 {
	public static void main(String[] args) {
		List<Integer> numerosInteiros = new ArrayList<>();
		
		// Adiciona numeros à lista
		for(int i = 0; i < 10; i++) {
			numerosInteiros.add(i);
		}
		
		System.out.println("Números da Lista: ");
		for (Integer n : numerosInteiros) {
			System.out.println(n);
		}
		
		System.out.println("Removendo numeros pares...\n");
		for (Integer n : new ArrayList<>(numerosInteiros)) {
		    if (n % 2 == 0) {
		        numerosInteiros.remove(n);
		    }
		}
		
		
		System.out.println("Números da nova Lista: ");
		for (Integer n : numerosInteiros) {
			System.out.println(n);
		}
	}
}
