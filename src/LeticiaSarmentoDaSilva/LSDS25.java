package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS25 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS25 - Tabuada com while");
		System.out.println("**********************");
		
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um númeroa: ");
        int numero = entrada.nextInt();

        int i = 1; 

        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++; 
        }

        entrada.close();
        
	}

}
