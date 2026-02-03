package secao5;

public class funcoes3 {

    public static void main(String[] args) {
        
        // função recursiva

        int soma = somaRecursiva(5);

          // method overloading

          System.out.println(soma(2, 3)); // chama o método com dois inteiros
          System.out.println(soma(2, 3, 4)); // chama o método com três inteiros


        // função lambda
        Runnable tarefa = () -> {System.out.println("Minha função lambda");};

        tarefa.run();

    }


    public static int somaRecursiva(int n) {

        if (n == 0) {
            return 0;
        } else {
            return n + somaRecursiva(n - 1);
        }
    }

      // methots overloading - mesma função com parâmetros diferentes

    public static int soma (int a, int b){
        return a + b;

    }

    public static int soma (int a, int b, int c){
        return a + b + c;

    }

    public static double soma (double a, double b){
        return a + b;

    }

     
    
}
