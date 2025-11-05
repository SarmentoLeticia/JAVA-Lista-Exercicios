package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS35 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS35 - Número positivo obrigatório");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in) ;
        int numero ; 
        
        do { 
            System.out.print("Digite um número: ") ;
            numero = entrada.nextInt() ;

            if (numero <= 0 ) {
                System.out.println("Número Inválido!") ;
            }
            
        } while (numero <= 0) ;
        
        System.out.println("Número Positivo!");
       
        entrada.close();  
    }
    
}
