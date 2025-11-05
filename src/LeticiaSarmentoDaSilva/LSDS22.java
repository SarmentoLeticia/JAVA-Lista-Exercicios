package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS22 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS22 - Soma de números até digitar zero");
		System.out.println("**********************");
		
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int numero = -1; 

        while (numero != 0) {
            System.out.print("Digite um número (0 para parar): ");
            numero = entrada.nextInt();
            soma += numero; 
        }

        System.out.println("A soma dos números digitados é: " + soma);

        entrada.close();
        
	}

}
