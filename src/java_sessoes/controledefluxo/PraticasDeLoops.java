package secao6;

import java.util.Scanner;


public class exercicios {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         
        // Exercício 1: Soma dos numeros de 1 a 100

    int somatorio = 0;

        for(int i = 0; i <= 100; i++) {

            somatorio += i;

        }

        System.out.println("Soma de 1 a 100: " + somatorio);

        // Exercício 2: Números pares de 1 a 20


        int numero = 1;

        while (numero <= 20) {

            if (numero % 2 == 0) 
                {
                System.out.println("Número par: " + numero);
                }
            }
            numero++;

           

        // Exercício 3: Verficar número primo

        int numeroPrimo = 29;
        boolean ePrimo = true;

        for (int i = 2; i < numeroPrimo; i++) {

             if (numeroPrimo % i == 0) {
                ePrimo = false;
                break;  
             } 
        } 
        if (ePrimo) {
            System.out.println("O número " + numeroPrimo + " é primo.");
        } else {
            System.out.println("O número " + numeroPrimo + " não é primo.");


        } 


    // Exercício 4: Menu de opções com do while

         int opcao;
         do {
            System.out.println("Menu de opções:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = (int)(Math.random() * 5); // Simulando a escolha do usuário

            System.out.println("Opção escolhida: " + opcao);
            
         } while (opcao != 5);
            


      // fatorial de um numero com for
    int numFatorial = 5;
    int fatorial = 1;

      for(int i = 1; i <= numFatorial; i++){

        fatorial *= i;
      }

         System.out.println("O fatorial de " + numFatorial + "é " + fatorial );



 // exercicio usando todas as estruturas de repetição

          int i = 10;

          while (i >= 1) {
            System.out.println(i);
            i--;
          } 



            do {
              System.out.println(i);
              i--;
            } while (i >= 1);

    } 
}
    

