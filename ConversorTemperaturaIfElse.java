package secao5;

import java.util.Scanner;

public class conversorTemp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de conversão: ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");

        int escolha = scanner.nextInt();

        if (escolha == 1) {

            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();

            System.out.println("Temperatura em Fahrenheit: " + celsiusParaFahrenheit(celsius));
        } else if (escolha == 2) {

            System.out.println("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            System.out.println("Temperatura em Celsius: " + fahrenheitParaCelsius(fahrenheit));
            
        }

        scanner.close();

    }

           public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
           }

           public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    
} }
