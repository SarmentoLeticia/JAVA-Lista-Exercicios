package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS05 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS05 - Notas e aprovação");
		System.out.println("**********************");

		Scanner entrada = new Scanner(System.in) ; 
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble(); 
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble(); 
		System.out.print("Digite a terceira nota: ");
		double nota3 = entrada.nextDouble(); 
		
		double media = (nota1 + nota2 + nota3) / 3 ; 
		
		if (media >= 6) {
			System.out.println("Aluno APROVADO com Média: " + media);
		} else {
			System.out.println("Aluno REPROVADO com Média: " + media);
		}
		
		entrada.close();
		
	}

}
