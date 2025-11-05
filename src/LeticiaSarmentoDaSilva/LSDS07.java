package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS07 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS07 - Triângulo válido");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in); 

        System.out.print("Digite o primeiro lado: ");
        int lado1 = entrada.nextInt(); 
        System.out.print("Digite o segundo lado: ");
        int lado2 = entrada.nextInt(); 
        System.out.print("Digite o terceiro lado: ");
        int lado3 = entrada.nextInt(); 

        if ((lado1 < lado2 + lado3) && 
            (lado2 < lado1 + lado3) && 
            (lado3 < lado1 + lado2)) {
            System.out.println("Triângulo VÁLIDO!");
        } else {
            System.out.println("Triângulo NÃO VÁLIDO!");
        }

        entrada.close();
    }
}
