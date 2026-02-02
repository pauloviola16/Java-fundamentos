package secao6;

import java.util.Scanner;

public class calculadoraSimples {

    public static void main(String[] args) {

/**
 * 
 * Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e subtração
 * 
 * 1 - Pedir dois números para o usuário (double)
 * 2 - Apresentar uma tabela/texto para escolher a operação
 * 3 - Resgatar a operação que o usuário seleciou
 * 4 - Realizar o calculo
 * 5 - Exibir o resultado
 * 6 - Se a operação escolhida for inválida, exibir mensagem de erro
 * 7 - Se a divisão for por 0, exibir mensagem de erro
 * 
 */
        
    Scanner scanner = new Scanner(System.in); 

    // Coletando os dados com o usuário
    System.out.println("Insira o primeiro número: ");
    double n1 = scanner.nextDouble();

     System.out.println("Insira o segundo número: ");
     double n2 = scanner.nextDouble();

    System.out.println("Escolha a operação a ser realizada entre os números: ");
    System.out.println("1 - Adição ");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");

    int operacao = scanner.nextInt();

    double resultado = 0;

    switch (operacao) {
        case 1:
            resultado = adicionar(n1, n2);
            break;
    
        case 2:
            resultado = subtrair(n1, n2);
            break;

            case 3:
            resultado = multiplicar(n1, n2);
            break;

             case 4:
            resultado = dividir(n1, n2);
            break;

            default:
            System.out.println("Operação inválida");
            break;
    }

     // Exibição do resultado
     System.out.println("O resultado da operação é " + resultado);


      scanner.close();
    }

    // funções das operações
      public static double adicionar (double n1, double n2) {
           return n1 + n2;

    }

     public static double subtrair (double n1, double n2) {
           return n1 - n2;

    }

    public static double multiplicar (double n1, double n2) {
           return n1 * n2;

    }

     public static double dividir (double n1, double n2) {
           return n1 / n2;

    }

    }
    

