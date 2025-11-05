package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS03 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS03 - Maior de dois números");
		System.out.println("**********************");

		Scanner entrada = new Scanner(System.in) ; 
		System.out.print("Digite o primeiro número: ");
		int numero1 = entrada.nextInt(); 
		System.out.print("Digite o segundo número: ");
		int numero2 = entrada.nextInt(); 
		
		if (numero1 > numero2) {
			System.out.println(numero1 + " é MAIOR que " + numero2);
		} else {
			System.out.println(numero2 + " é MAIOR que " + numero1);
		}
		
		entrada.close();
		
	}

}
