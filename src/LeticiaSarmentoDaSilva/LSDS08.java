package LeticiaSarmentoDaSilva;

import java.util.Scanner;

public class LSDS08 {

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Aluno: Letícia Sarmento Da Silva - RA: 0024379");
        System.out.println("Classe LSDS08 - Login simples");
        System.out.println("**********************");

        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("----- Tela de Cadastro -----");
        System.out.print("Digite o Nome de Usuário para se Cadastrar: ");
        String nomeUsuario = entrada.next(); 
        System.out.print("Digite a Senha para se Cadastrar: ");
        String senha = entrada.next() ; 
        
        System.out.println("----- Tela de Login ----- ");
        System.out.print("Digite o Nome de Usuário para se Conectar: ");
        String usuarioLogin = entrada.next(); 
        System.out.print("Digite a Senha para se Conectar: ");
        String senhaLogin = entrada.next() ; 
        
        if (nomeUsuario.equals(usuarioLogin) && senha.equals(senhaLogin)) {
        	System.out.println("Usuário LOGADO!");
        } else {
        	System.out.println("Usuário ou Senha INVÁLIDOS!");
        }

        entrada.close();
        
    }
}
