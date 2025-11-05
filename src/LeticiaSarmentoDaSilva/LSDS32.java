package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS32 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS32 - Tabuada de um número");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in) ;
        System.out.print("Digite um número: ") ;
        int numero = entrada.nextInt() ; 
        int i = 1 ; 
        
        System.out.println("Tabuada do " + numero) ;
        
        do {
        	System.out.println(numero + " x " + i + " = " + (numero * i));
        	i ++ ; 
        } while (i <= 10) ; 
        
        entrada.close();   

    }
    
}
