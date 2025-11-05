package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS34 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS34 - Pedir senha até acertar");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in) ;
        int senha ; 
        
        do { 
            System.out.print("Digite a senha: ") ;
            senha = entrada.nextInt() ;

            if (senha != 1111) {
                System.out.println("Senha Incorreta!") ;
            } else {
            	System.out.println("Acesso liberado!");
            }
            
        } while (senha != 1111) ;
       
        entrada.close();  
    }
    
}
