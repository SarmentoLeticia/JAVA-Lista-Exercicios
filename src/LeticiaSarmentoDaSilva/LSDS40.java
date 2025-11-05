package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS40 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS40 -  Ler números e mostrar o maior (até digitar negativo)");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in) ;
        int numero , maior = 0 ; 
        
        do { 
            System.out.print("Digite um número: ") ;
            numero = entrada.nextInt() ;
            
            if (numero > 0) {
                if (numero > maior) {
                	maior = numero ; 
                } 
            } else {
            	System.out.println("Número Negativo!");
            }

        } while (numero > 0) ;
        
        System.out.println("O maior número positivo digitado é: " + maior);
       
        entrada.close(); 
    }
    
}
