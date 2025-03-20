package atividade02_arrays_e_colecoes_de_dados.exercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Crie uma lista de nomes e remova todos os nomes que começam com a letra "A".

public class Exercicio02 {
	public static void main(String[] args) {
		List<String> nomes =  new ArrayList<>();
		List<String> nomesComA = new ArrayList<String>();
		
		nomes.add("Maria");
		nomes.add("Felipe");
		nomes.add("Amanda");
		nomes.add("Alice");
		nomes.add("Ana");
		
		// Exibi todos os nomes da lista
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		
		// Remove nomes 
		for (String nome : new ArrayList<>(nomes)) {
		    if (nome.charAt(0) == 'A') {
		        nomes.remove(nome);
		    }
		}
		
		System.out.println("-----------------------------------");
		
		// Exibi todos os nomes da lista
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}
