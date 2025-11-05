package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS30 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS30 - Menu até escolher sair");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in) ;
        String menu = "" ;

        while (!menu.equalsIgnoreCase("sair")) { 
            System.out.println("\nMENUS: ") ;
            System.out.println("Login") ;
            System.out.println("Cadastro") ;
            System.out.println("Sair") ;
            System.out.print("Digite o menu desejado: ") ;
            menu = entrada.next() ;

            if (menu.equalsIgnoreCase("Login")) {
                System.out.println("----- Tela de Login -----") ;
            } else if (menu.equalsIgnoreCase("Cadastro")) {
                System.out.println("----- Tela de Cadastro -----") ;
            } else if (!menu.equalsIgnoreCase("Sair")) {
                System.out.println("Opção Inválida!!!") ;
            }
        }

        System.out.println("Saindo do Programa!") ; 
       
        entrada.close();   
        
    }
}
