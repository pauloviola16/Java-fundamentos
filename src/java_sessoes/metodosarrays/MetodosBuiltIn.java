package secao5;

public class funcoesBuiltIn {

    public static void main(String[] args) {
        
     // funcoes built-in

     String texto = "Olá Mundo!";

     // length
     System.out.println(texto.length());


     // pega apenas parte do texto - substring
    System.out.println(texto.substring(0,2));

    //toUpperCase
    System.out.println(texto.toUpperCase());

    //replace, troca uma palavra por outra
    System.out.println(texto.replace("Mundo", "Java"));


    // funcões de math

    // math.sqrt - raiz quadrada
    System.out.println(Math.sqrt(9));

    //math.pow - potencia
    System.out.println(Math.pow(2, 3));

    //math.abs - valor absoluto
    System.out.println(Math.abs(-10));
    }
    
}
