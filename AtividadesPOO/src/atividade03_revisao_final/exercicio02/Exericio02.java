package atividade03_revisao_final.exercicio02;

import java.util.Scanner;

// Enuciado: : Crie um programa que leia uma nota de 0 a 100 e informe a classificação: 
// A (>=90), B (>=80), C (>=70), D (>=60), F (<60).

public class Exericio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float nota1;
		
		System.out.print("Digite o valor da nota: ");
		nota1 = scan.nextFloat();
		
		
		boolean notaMaioroOuIgual90 = nota1 >= 90;
		boolean notaMaiorOuIgual80 = nota1 >= 80;
		boolean notaMaiorOuIgual70 = nota1 >= 70;
		boolean notaMaiorOuIgual60 = nota1 >= 60;
		boolean notaMenorQue60 = nota1 < 60;
		
		if ( notaMaioroOuIgual90 ) {
			System.out.println("Classificação: A");
			
		} else if ( notaMaiorOuIgual80 ) {
			System.out.println("Classificação: B");
			
		} else if ( notaMaiorOuIgual70 ) {
			System.out.println("Classiificação: C");
			
		} else if ( notaMaiorOuIgual60 ) {
			System.out.println("Classificação: D");
			
		} else if ( notaMenorQue60 ) {
			System.out.println("Classificação: F");
		}
		
		

	}

}
