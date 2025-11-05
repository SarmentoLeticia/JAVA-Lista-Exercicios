package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS20 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS20 - Números de Fibonacci (n termos)");
		System.out.println("**********************");
				
		Scanner entrada = new Scanner(System.in) ; 
		System.out.print("Digite o número: ");
		int n = entrada.nextInt(); 
        int primeiro = 0, segundo = 1;

        System.out.print("Sequência de Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        
		entrada.close();

						
	}

}
