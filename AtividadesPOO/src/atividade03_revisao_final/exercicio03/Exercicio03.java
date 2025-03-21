package atividade03_revisao_final.exercicio03;

import java.util.ArrayList;
import java.util.List;

// Enuciado: Crie um programa que percorra uma List de nomes e 
// exiba cada nome em letras maiúsculas.

public class Exercicio03 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		int i = 0;
		
		nomes.add("Bruna");
		nomes.add("Fabiane");
		nomes.add("Luiza");
		nomes.add("Maria");
		
		System.out.println("Valores da lista: ");
		for (String n : nomes) {
			System.out.println(n);
		}
		System.out.println("------------------------------------");
		System.out.println("Modificando...");
		System.out.println("------------------------------------");
		for (String n : nomes) {
			nomes.set(i, n.toUpperCase());
			i++;
		}
		
		System.out.println("Valores da nova lista: ");
		for (String n : nomes) {
			System.out.println(n);
		}

	}

}
