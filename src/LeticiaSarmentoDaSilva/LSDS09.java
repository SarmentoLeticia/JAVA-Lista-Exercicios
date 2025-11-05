package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS09 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS09 - Ordem crescente (três números)");
		System.out.println("**********************");

		Scanner entrada = new Scanner(System.in) ; 
		System.out.print("Digite o primeiro número: ");
		int numero1 = entrada.nextInt(); 
		System.out.print("Digite o segundo número: ");
		int numero2 = entrada.nextInt(); 
		System.out.print("Digite o terceiro número: ");
		int numero3 = entrada.nextInt(); 
		
		int menor, meio, maior;
		
        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
            if (numero2 <= numero3) {
                meio = numero2;
                maior = numero3;
            } else {
                meio = numero3;
                maior = numero2;
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
            if (numero1 <= numero3) {
                meio = numero1;
                maior = numero3;
            } else {
                meio = numero3;
                maior = numero1;
            }
        } else {
            menor = numero3;
            if (numero1 <= numero2) {
                meio = numero1;
                maior = numero2;
            } else {
                meio = numero2;
                maior = numero1;
            }
        }

        System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);

		entrada.close();
		
	}

}
