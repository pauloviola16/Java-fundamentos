package secao2;

public class variavel {
    
    public static void main(String[] args) {
        
        // tipo - nome - atribuir valor
        String nome = "Paulo"; 

        System.out.println(nome);

        int idade = 21;

        System.out.println("A idade de " + nome + " é " + idade);


        // int

        int n = 10;

        System.out.println(n * 10);


        // double

        double preco = 20.99;

        System.out.println(preco - 12.99); 


        // Comentários

        /* Comentario de varias linhas
        
        linha 1
        linha 2
        etc
    
        */


        /* Operacções aritméticas
        
        Incremento: ++ adiciona o valor 1 a variavel
        Decremento: -- subtrai o valor 1 a variavel

        Atribuição aditiva: += soma e atribui o valor a variavel
        Atribuição subtrativa: -= subtrai e atribui o valor a variavel
        
        */

        /* 
    EXERCÍCIO 1:

    Crie uma variável int para armazenar o valor 10. 
    Crie uma segunda variável int que armazene o dobro do valor da primeira variável
    usando operadores aritméticos. 
    Exiba o resultado. */

    int n1 = 10;
    int dobro = n1 * 2;

   

/*
    EXERCÍCIO 2:

    Declare duas variáveis double para armazenar os valores 15.75 e 20.40. 
    Some os valores dessas variáveis e armazene o resultado em uma nova variável double. 
    Exiba o resultado.
    */

    double valor1 = 15.75;
    double valor2 = 20.40;
    double soma = valor1 + valor2;    

   /*
    EXERCÍCIO 5:

    Escreva um programa que crie uma variável String com o valor "Olá, Mundo!". 
    Em seguida, crie outra variável String que concatene a primeira variável com o texto 
    " Bem-vindo ao Java!". 
    Exiba o resultado. */

    String Olá = "Olá Mundo!";
    String Olá2 = Olá + " Bem-vindo ao Java!";


// CONSTANTES

    final int DIAS_DA_SEMANA = 7;

System.out.println("Dias da semana: " + DIAS_DA_SEMANA); 

// 13 - var

        var z = 10;

        System.out.println(z);

        // z = "teste";
        z = 5;

        var texto2 = "teste";

        var doubleteste = 2.0;

        System.out.println(texto2);

        System.out.println(doubleteste);
} }
    