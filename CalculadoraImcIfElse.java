package secao4CalcImc;

import java.util.Scanner;

public class calculadoraImc {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Insira sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println(imc);


        if (imc < 18.5) {

            System.out.println("Seu IMC é: " + imc + "Abaixo do peso");

        }

        else if (imc >= 18.5 && imc <= 24.9) {
            
            System.out.println("Seu IMC é: " + imc + " Peso normal");
        }
        
        else if (imc >= 25 && imc <= 29.9) {

            System.out.println("Seu IMC é: " + imc + " Sobrepeso");
            
        } else { 

            System.out.println("Obesidade");
            
        } 
        scanner.close();    
    }
    
}
