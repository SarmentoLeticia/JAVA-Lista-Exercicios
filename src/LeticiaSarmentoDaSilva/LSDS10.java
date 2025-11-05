package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS10 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS10 - Ano bissexto");
		System.out.println("**********************");

		Scanner entrada = new Scanner(System.in) ; 
		System.out.print("Digite o ano: ");
		int ano = entrada.nextInt(); 

		
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println(ano + " é BISSEXTO!");
		} else {
			System.out.println(ano + " NÃO É BISSEXTO!");
		}
		
		entrada.close();
		
	}

}
