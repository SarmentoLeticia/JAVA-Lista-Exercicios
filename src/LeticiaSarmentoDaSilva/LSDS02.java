package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS02 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS02 - Par ou ímpar");
		System.out.println("**********************");

		Scanner entrada = new Scanner(System.in) ; 
		System.out.print("Digite um número: ");
		int numero = entrada.nextInt(); 
		
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é PAR!");
		} else {
			System.out.println("O número " + numero + " é IMPAR!");
		}
		
		entrada.close();
		
	}

}
