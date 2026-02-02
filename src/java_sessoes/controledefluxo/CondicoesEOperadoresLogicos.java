package java_sessoes.fundamentos;

public class Condicionais {

    public static void main(String[] args) {
    
// 1 - o que é boolean?
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

  // Operadores de comparação
        int a = 10;
        int b = 5;

        System.out.println(a > b);  // maior que
        System.out.println(a < b);  // menor que
        System.out.println(a >= b); // maior ou igual a
        System.out.println(a <= b); // menor ou igual a
        System.out.println(a == b); // igual a
        System.out.println(a != b); // diferente de

 

        // Comparação de strings

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));


       // if

       int numero = 10;

       if (numero > 5) {

        System.out.println("O número é maior que 5");

       }

       // if com strings

       String texto = "Teste";

       if (texto.equals("Teste")) {

        System.out.println("O texto é igual a Teste");

       }


     // else

        int i = 21;

        if (i < 15) {

            System.out.println("i é menor que 15");

          } else {

            System.out.println("i é maior ou igual a 15");

          }

      
        // else if

         double nota = 8.5;

            if(nota >= 9) {
                System.out.println("Excelente");

            } else if (nota >= 7) {

                System.out.println("Bom");

            } else if (nota >= 5) {

                System.out.println("Regular");

            } else {

                System.out.println("Insuficiente");
            }

    }
    
}
