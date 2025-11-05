package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS24 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS24 - Verificar se um número é positivo");
		System.out.println("**********************");
		
        Scanner entrada = new Scanner(System.in);
        int numero = -1; 

        while (numero < 0) {
            System.out.print("Digite um número (Número positivo caso queira Parar): ");
            numero = entrada.nextInt();
        }
        
        System.out.println("Número Positivo digitado! Fim!");

        entrada.close();
        
	}

}
