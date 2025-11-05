package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS38 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS38 - Confirmar saída com 's'");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in) ;
        String menu ; 
        
        do { 
            System.out.println("Para sair digite 's'! ") ;
            System.out.print("Deseja sair? ") ;
            menu = entrada.next() ;

            if (menu.equalsIgnoreCase("s")) {
                System.out.println("Saindo!") ;
            } else {
            	System.out.println("Tente Novamente!");
            }
        } while (!menu.equalsIgnoreCase("s")) ;
       
        entrada.close(); 
    }
    
}
