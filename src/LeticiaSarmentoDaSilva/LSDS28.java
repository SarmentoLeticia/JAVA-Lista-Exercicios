package LeticiaSarmentoDaSilva;

public class LSDS28 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS28 - Soma dos pares entre 1 e 100");
        System.out.println("**********************");

        int i = 1 , soma = 0 ; 

        while (i <= 100) {
        	if (i % 2 == 0) {
        		soma += i ; 
        	}
        	i ++ ;
        }

        System.out.println("A soma de todos os números pares entre 1 e 100 é: " + soma);
        
    }
}
