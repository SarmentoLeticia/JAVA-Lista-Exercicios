package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS39 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS39 - Validar número entre 1 e 5");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in) ;
        int numero ; 
        
        do { 
            System.out.print("Digite um número entre 1 e 5: ") ;
            numero = entrada.nextInt() ;

            if (numero < 1 || numero > 5) {
                System.out.println("Número Inválido!") ;
            } else {
            	System.out.println("Número Correto!");
            }
        } while (numero < 1 || numero > 5) ;
       
        entrada.close(); 
    }
    
}
