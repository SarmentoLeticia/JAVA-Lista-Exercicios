package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS23 {

	public static void main(String[] args) {

		System.out.println("**********************");
		System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
		System.out.println("Classe LSDS23 - Senha correta");
		System.out.println("**********************");
		
        Scanner entrada = new Scanner(System.in);
        String senhaCorreta = "leticia"; 
        System.out.print("Digite a senha: ");
        String senhaDigitada = entrada.next();


        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Senha INCORRETA! \n" + "Digite a senha: ");
            senhaDigitada = entrada.next();
        }

        System.out.println("Senha CORRETA!");

        entrada.close();
        
	}

}
