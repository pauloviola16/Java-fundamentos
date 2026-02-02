package secao3;

import java.util.Scanner;

public class UltimoExercicio {

    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);

      System.out.println("Insira a sua idade: ");

        int idade = scanner.nextInt();

        if (idade < 18) {

            System.out.println("Menor de idade");

        } else if (idade > 18 && idade < 65) {

            System.out.println("Adulto");

        } else {

            System.out.println("Idoso");
            
        }

        scanner.close();

    }
    
}
