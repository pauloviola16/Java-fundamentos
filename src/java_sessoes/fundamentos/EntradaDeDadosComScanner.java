package java_sessoes.fundamentos;

import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira seu nome
        System.out.print("Digite seu nome: ");
        
        // Lendo a entrada do usuário
        String nome = scanner.nextLine();

        // Exibindo o nome inserido
        System.out.println("Olá " + nome + "!");

        //Solicitando ao usuário que insira sua idade
        System.out.println("Digite sua idade: ");

        // nextInt lê um valor inteiro da entrada do usuário
        int idade = scanner.nextInt();

        // Exibindo a idade inserida
        System.out.println("O " + nome + " tem " + idade + " anos");

    //Problema do nextLine

   System.out.println("Digite sua idade: ");

   int n = scanner.nextInt();

     scanner.nextLine(); // Resolve o problema de texto vazio

   System.out.println("Digite seu nome: ");

   String txt = scanner.nextLine(); 

   System.out.println( "O " + txt + " tem " + n + " anos");


 // fechar o scanner
        scanner.close();

    }
    
}
