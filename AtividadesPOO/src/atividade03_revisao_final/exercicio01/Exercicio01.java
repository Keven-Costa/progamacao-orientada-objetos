package atividade03_revisao_final.exercicio01;

import java.util.Scanner;

// Enuciado: : Escreva um programa que leia dois números 
// inteiros e exiba qual deles é maior.


public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.print("Digite o 1 número: ");
		n1 = scan.nextInt();
		
		System.out.print("Digite o 2 número: ");
		n2 = scan.nextInt();
		
		if ( n1 > n2 ) {
			System.out.println("O numero " + n1 + " é o maior");
		
		} else if ( n2 > n1 ) {
			System.out.println("O número " + n2 + " é maior");
		}
		

	}

}
