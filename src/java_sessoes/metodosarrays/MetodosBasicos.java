package secao5;

public class funcoes {

    public static void main(String[] args) {
        
        // Primeira chamada da função
        saudacao();

        // Parametros na função
        soma(5, 20);

        int numero = 10;

        int numeroDobrado = dobrar (numero);

        System.out.println("O número dobrado de " + numero + " é: " + numeroDobrado);

        // Retorno em variáveis
        
        String r1 = verificarPar(numero);
        String r2 = verificarPar(7);

        System.out.println(r1);
        System.out.println(r2);
 
    }

  // NOME, ARGUMENTOS E BLOCO
  public static void saudacao() {

     System.out.println("Olá, seja bem-vindo(a)!");

  }

    // Parametros na função
  public static void soma(int a, int b) {
          int resultado = a + b;
          System.out.println("A soma é: " + resultado);

  }

  public static int dobrar(int n) {
      return n * 2;
}

public static String verificarPar (int n){
   if (n % 2 == 0) {
       return n + " é par";
   } else {
     return n + " é ímpar";
   }

}

}
