package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS01 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS01 - Número positivo ou negativo");
		System.out.println("**********************");

		Scanner entrada = new Scanner(System.in) ; 
		System.out.print("Digite um número: ");
		int numero = entrada.nextInt(); 
		
		if (numero > 0) {
			System.out.println("O número " + numero + " é POSITIVO!");
		} else {
			System.out.println("O número " + numero + " é NEGATIVO!");
		}
		
		entrada.close();
		
	}

}
