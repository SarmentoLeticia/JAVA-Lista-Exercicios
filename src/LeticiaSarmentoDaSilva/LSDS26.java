package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS26 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS26 - Número primo com while");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in) ;
        System.out.print("Digite um número: ") ;
        int numero = entrada.nextInt() ;

        int i = 2 ; 
        boolean primo = true ; 

        while (i <= numero / 2) { 
            if (numero % i == 0) { 
                primo = false;
                break ; 
            }
            i++ ;
        }

        if (numero <= 1) {
            primo = false ; 
        }

        if (primo) {
            System.out.println("O número " + numero + " É PRIMO");
        } else {
            System.out.println("O número " + numero + " NÃO É PRIMO");
        }

        entrada.close();
        
    }
}
