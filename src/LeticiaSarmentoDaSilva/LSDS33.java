package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS33 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS33 - Menu com opção de sair");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in) ;
        int menu ; 
        
        do { 
            System.out.println("MENUS: ") ;
            System.out.println("1 - Mensagem") ;
            System.out.println("2 - Sair") ;
            System.out.print("Digite o menu desejado: ") ;
            menu = entrada.nextInt() ;

            if (menu == 1) {
                System.out.println("Você escolheu a mensagem!") ;
            } else if (menu == 2) {
                System.out.println("Saindo!") ;
            } else {
            	System.out.println("Opção inválida! Digite 1 ou 2!") ;
            }
        } while (menu != 2) ;
       
        entrada.close();  
    }
    
}
