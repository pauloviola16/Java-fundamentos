package secao5;

public class exercicios {

    public static void main(String[] args) {
         
    // Exercício 1: Conversão de Celsius para Fahrenheit
        double celsius = 34;
        double fahrenheit = celsiusParaFahrenheit(celsius);
        System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");
       
  

    // Exercício 2: Cálculo do Fatorial de um número
         System.out.println("Fatorial de 5 é: " + calcularFatorial(5)); 



         // Exercício 3: Verificação de número par ou ímpar
         System.out.println(parOuImpar(7));


         // Exercício 4: Classificação de notas
            System.out.println(notaProva(8));
            System.out.println(notaProva(3));

          
 }



    // Método para converter Celsius para Fahrenheit
   public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }



    //Cálculo do Fatorial de um número
    public static int calcularFatorial (int numero){
    
        if (numero == 0 || numero == 1) {
            return 1;
            
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }

  // Verificação de número par ou ímpar
    public static String parOuImpar (int numero){
          
        if (numero % 2 == 0){

              return "O número é par.";

        } else {

                return "O número é ímpar.";

        }
    }


    // Exercício 4: Classificação de notas
    public static String notaProva (int nota){

        if (nota > 10 || nota < 0) {
            return "Nota inválida";
        }

        switch (nota) {
            case 10:
            case 9:
                return "Nota A";
            case 8:
            case 7:
                return "Nota B";
            case 6:
                return "Nota C";
            default:
                return "Reprovado";
        
        }


    }

}
