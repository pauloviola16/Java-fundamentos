package secao6;

import java.util.Scanner;

public class exercicios2 {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    //Usuário digitar um numero e ver a tabuada do número

     System.out.println("Digite um número para ver sua tabuada");
     int n = scanner.nextInt();

    for (int j = 1; j <= 10; j++){

        System.out.println(n * j);
    } 

    // tabuada dos numeros de 1 a 3

    int n1 = 1;
    int n2 = 2;
    int n3 = 3;

    for (int j = 0; j <= 10; j++){

        System.out.println(n1 * j);
        System.out.println(n2 * j);
        System.out.println(n3 * j);
    }





    }
    
}
