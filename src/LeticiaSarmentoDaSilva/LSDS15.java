package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS15 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS15 - Fatorial de um número");
		System.out.println("**********************");
				
		Scanner entrada = new Scanner(System.in) ; 
		System.out.print("Digite o número: ");
		int numero = entrada.nextInt(); 
				
		int fatorial = 1 ; 
		
		for (int i = 1 ; i <= numero ; i++) {
			fatorial *= i ; 
		}
		
		System.out.println("O Fatorial de " + numero + " é: " + fatorial);
		
		entrada.close();
						
	}

}
