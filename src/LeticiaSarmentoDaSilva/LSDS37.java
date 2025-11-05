package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS37 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS37 - Soma até o número ser múltiplo de 10");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in) ;
        int soma = 0 , numero ; 
        
        do { 
            System.out.print("Digite um número: ") ;
            numero = entrada.nextInt() ;
            soma += numero ;  
        } while (numero % 10 != 0) ;
        
        System.out.println("A soma dos números digitados é: " + soma);
       
        entrada.close();  
    }
    
}
