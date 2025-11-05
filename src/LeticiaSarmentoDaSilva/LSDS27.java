package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS27 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS27 - Quantidade de números ímpares digitados");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in) ;
        
        int quantidadeImpares = 0 ;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ") ;
            int numero = entrada.nextInt() ;

            if (numero % 2 != 0) { 
                quantidadeImpares++ ;
            }
        }

        System.out.println("Você digitou " + quantidadeImpares + " números ímpares.") ;

        entrada.close() ;
        
    }
}
