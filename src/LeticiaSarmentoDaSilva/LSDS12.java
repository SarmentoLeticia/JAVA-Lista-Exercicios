package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS12 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS12 - Tabuada de um número");
		System.out.println("**********************");
		
		Scanner entrada = new Scanner(System.in) ; 
		System.out.print("Digite o número: ");
		int numero = entrada.nextInt(); 
		
		System.out.println("Tabuada do Número: " + numero);
		
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
		
		entrada.close();
		
	}

}
