package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS29 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS29 - Contar dígitos de um número");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in) ;
        System.out.print("Digite um número positivo: ") ;
        int numero = entrada.nextInt() ; 
        
        if (numero < 0) {
            System.out.println("Número inválido! Digite apenas números positivos.") ;
        } else {
            int contador = 0;
            int num = numero;

            while (num > 0) {
                num = num / 10 ; 
                contador ++ ;
            }
            if (numero == 0) {
                contador = 1 ;
            }

            System.out.println("O número " + numero + " tem " + contador + " dígito(s).") ;
            
        }
        
        entrada.close();        
    }
}
