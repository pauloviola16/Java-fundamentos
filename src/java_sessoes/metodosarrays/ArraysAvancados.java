package secao7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AvancadoArray {

    public static void main(String[] args) {
        
        // ordenação de arrays

        int[] numeros = {1,22,4,2,5,7};

        // ordena os números
        // altera o array original
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));


      // ordenação com comparator

      String[] nomes = {"Paulo", "Maria", "Simone"};

      // ordena pelo alfabeto
      Arrays.sort(nomes);

      // ordena pelo alfabeto mas ao contrário
      Arrays.sort(nomes, Comparator.reverseOrder());

      System.out.println(Arrays.toString(nomes));



    int[][] matriz = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

     // IMPRIMIR UMA MATRIZ SEM USAR FOREACH
     System.out.println(Arrays.deepToString(matriz));



    // MANIPULAÇÃO AVANÇADA

    int[] original = {1,2,3,4};


   // copyof - copia os elementos de um array sem mudar o original
    int[] copia = Arrays.copyOf(original, 2); // pode copiar apenas os 2 primeiros elementos por ex

    System.out.println(Arrays.toString(copia));


   // fill = preenchimento

     int[] nums = new int[5];

     System.out.println(Arrays.toString(nums)); // imprime cinco vezes o numero 0 já que ainda nao inserimos nenhum valor

     Arrays.fill(nums, 5); // imprime cinco vezes o numero 5

     System.out.println(Arrays.toString(nums)); 



     // tranformação de array para stream

     int[] values = {1,3,5,7};

     // fazer a soma dos elementos
     int sum = Arrays.stream(values).sum();

     System.out.println(sum);


     // Arrays dinâmicos

     ArrayList<String> frutas = new ArrayList<>();

     frutas.add("Banana");
     frutas.add("Melão");

     frutas.remove("Banana");

     for(String fruta : frutas){
        System.out.println(fruta);
     }

     String frutaEspecifica = frutas.get(0);
     System.out.println(frutaEspecifica);

    
    }
    
}
