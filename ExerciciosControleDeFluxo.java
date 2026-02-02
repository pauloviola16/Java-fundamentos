package secao3;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {      
      
        Scanner scanner = new Scanner(System.in);

        //EXERCÍCIO 1

        System.out.println("Insira o valor do produto: ");
        int valorProduto = scanner.nextInt();

        if (valorProduto < 50) {

            System.out.println("Barato");
            
        } else if (valorProduto >= 50 && valorProduto <= 100) {

            System.out.println("Médio");
            
        } 
        else {

            System.out.println("Caro");
            
        }

        //EXERCÍCIO 2

        System.out.println("Insira o seu nome : ");
        String nome = scanner.next();


        System.out.println("Insira sua senha: ");
        String senha = scanner.next();

        if (nome.equals("admin") && senha.equals("1234")) {

            System.out.println("Acesso permitido");
            
        } else {

            System.out.println("Acesso negado");
            
        }


        //EXERCÍCIO 3

        System.out.println("Insira um número: ");

        int numero = scanner.nextInt();

        String resultado = "";

        if (numero % 2 == 0) {

            resultado = "par";
            
        } else {

            resultado = "ímpar";
        }

        System.out.println("O número é " + resultado);




        //EXERCÍCIO 4

       System.out.println("Insira um número de 1 a 7: ");

       int diaSemana = scanner.nextInt();

         switch (diaSemana) {
    
                case 1:
                case 7:
                 System.out.println("Fim de semana");
                 break;
    
                case 3:
                case 4:   
                case 5:
                case 6:    
                case 2:
                 System.out.println("Dia útil");
                 break;
    
                default:
                 System.out.println("Dia inválido");
                 break;
          }


         
          // EXERCÍCIO 5

          System.out.println("Insira um número: ");

          int num = scanner.nextInt();

          if (num >= 10 && num <= 20) {

                System.out.println("O número está dentro do intervalo");
                
            } else {
    
                System.out.println("O número está fora do intervalo");
            
          }

         
            // EXERCÍCIO 6

            System.out.println("Insira uma letra: ");

            char letra = scanner.next().toLowerCase().charAt(0); 

            switch (letra) {
                case 'a':
                case 'e':
                case 'i':    
                case 'o':
                case 'u':

                System.out.println("A letra é uma vogal");
                    break;
            
                default:
                System.out.println("A letra é uma consoante");
                    break;
            }

            scanner.close();
        
    }
    
}
