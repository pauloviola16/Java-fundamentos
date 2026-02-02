package java_sessoes.fundamentos;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        
  System.out.println("Digite um número para ver sua tabuada:");

    int n = scanner.nextInt();

    System.out.println(n + " x 1 = " + (n * 1));
    System.out.println(n + " x 2 = " + (n * 2));
    System.out.println(n + " x 3 = " + (n * 3));
    System.out.println(n + " x 4 = " + (n * 4));
    System.out.println(n + " x 5 = " + (n * 5));
    System.out.println(n + " x 6 = " + (n * 6));
    System.out.println(n + " x 7 = " + (n * 7));
    System.out.println(n + " x 8 = " + (n * 8));
    System.out.println(n + " x 9 = " + (n * 9));
    System.out.println(n + " x 10 = " + (n * 10));

    scanner.close();

    }
}
