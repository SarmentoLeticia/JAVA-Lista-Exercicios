package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS04 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS04 - Pode votar?");
		System.out.println("**********************");

		Scanner entrada = new Scanner(System.in) ; 
		System.out.print("Digite a idade: ");
		int idade = entrada.nextInt(); 
		
		if (idade >= 18 && idade <= 70) {
			System.out.println("VOTO OBRIGATÓRIO!");
		} else if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println("VOTO FACULTATIVO!");
		} else {
			System.out.println("NÃO PODE VOTAR!");
		}
		
		entrada.close();
		
	}

}
