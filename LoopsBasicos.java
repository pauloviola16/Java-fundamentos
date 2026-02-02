package secao6;

public class Loops {
 
     public static void main(String[] args) {
        
        // 1 - for

        // loop que vai rodar de 1 a 5

        // variavel de inicializacao = i, j , k
        // condicao de parada
        // incremento ou decremento

        for(int i = 1; i <= 5; i++) {

            System.out.println("Contador: " + i);

        }

        // mostrar caracteres de uma palavra

        String palavra = "Java";

        for(int i = 0; i < palavra.length(); i++) {

            System.out.println(palavra.charAt(i));
        }


        // 2 - while
        int i = 1;

         while( i <= 5 ) {

            System.out.println("Contador WHILE: " + i);

            i++;
            
         }

            // 3 - do while

            int j = 10;

            do {
                System.out.println("O valor de j é: " + j);
                j--;

            } while (j > 0);
        

            // break - interrompe o loop

            for( int x = 0; x < 10; x++){
            
                System.out.println("O valor de x é:" + x);

                 if (x == 5) {
                    System.out.println("Chegou no valor 5, saindo do loop.");
                    break;
                 }
           }

            // continue - pula a iteração atual

            for( int y = 10; y > 0; y--){
            
              if (y % 2 == 0) {

                System.out.println("Par");
                continue;
              }

              System.out.println("O valor de y é:" + y);
     }
     
} }