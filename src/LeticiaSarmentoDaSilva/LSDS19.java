package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS19 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS19 - Verificar se um número é primo");
		System.out.println("**********************");
				
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        
        boolean primo = true; 

        if (numero <= 1) {
            primo = false; 
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false; 
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("O número " + numero + " é PRIMO!");
        } else {
            System.out.println("O número " + numero + " NÃO É PRIMO!");
        }

        entrada.close();	
	}

}
