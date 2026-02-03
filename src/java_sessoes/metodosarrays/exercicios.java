package secao7;

import java.util.Arrays;
import java.util.Comparator;

public class exercicios {

    public static void main(String[] args) {
        
        //EXERCICIO 1 - INVERTER OS NUMEROS DE UM ARRAY
        int[] numeros = {1,2,3,4,5};
        int[] numerosInvertido = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++){

            numerosInvertido[i] = numeros[numeros.length - 1 - i];

        }
           System.out.println(Arrays.toString(numerosInvertido));



           // Criar um array de 5 inteiros e imprimir todos os valores.

         int[] valores = {1,2,3,4,5};
         System.out.println(Arrays.toString(valores));


         //Ler 10 números do usuário e mostrar o maior valor.

         int[] nums = {1,2,3,4,5,6,7,8,9,10};

         int maiorValor = nums [0];

         for (int i = 1; i < nums.length; i++){
               if (maiorValor < nums[i]) {
                  maiorValor = nums[i];
               }
         }

         System.out.println("O maior valor é " + maiorValor);

         //Calcular a média dos valores de um array de números reais.

         double [] notas = {9.5 , 8.0, 6.5, 5.5, 4.0};

         double soma = 0;

         for(int i = 0; i < notas.length; i++){
            soma += notas[i];
         }

         double media = soma / notas.length;

        System.out.println("A média é " + media);

         //Contar quantos números pares existem em um array.

        int [] nums2 = {1,2,3,4,5,6,7,8};
        int numerosPares = 0;

        for (int i = 0; i < nums2.length; i++){

            if (nums2[i] % 2 == 0) {
                
                numerosPares = nums2[i];
                System.out.println("Esses são os numeros pares " + numerosPares);

            }

        }

         //Inverter a ordem dos elementos de um array.

         int[] nums3 = {1,2,3,4,5};
         int[] numsInvertido = new int[nums3.length];

         for(int i = 0; i < nums3.length; i++){

            numsInvertido[i] = nums3 [nums3.length - 1 - i];
         }

         System.out.println(Arrays.toString(numsInvertido));



         //Verificar se um valor específico existe no array. (usando nums3)

        int valorProcurado = 4;
        boolean achou = false;

        for(int i = 0; i < nums3.length; i++){

             if (nums3 [i] == valorProcurado) {
                achou = true;
                break;
             }

        }

        //  COM STRINGS

        String[] nomes = {"Maria" , "Paulo", "Cláudio"};

        boolean nomeEncontrado = false;

        for(String nome : nomes){
            if (nome.equals("Maria")) {
                nomeEncontrado = true;
                break;
            }

        }

        System.out.println("Nome encontrado: " + nomeEncontrado);



         //Criar um programa que copie os valores de um array para outro.

         // solução mais simples e que não altera o valor do array original
         int[] nums3Clone = nums3.clone();
         System.out.println(nums3Clone);

         //usando o for
         int[] numsClone = new int[nums.length];

         for(int i = 0; i < nums.length; i++){
            numsClone[i] = nums[i];
         }


     // Encontrar o maior valor

     int[] numeros2 = {1,2,3,4,5,12,14,15};
     int maiorValor2 = numeros2 [0];

     for(int i = 1; i < numeros2.length; i++){

         if (maiorValor2 < numeros2[i]) {
            maiorValor2 = numeros2[i];
            
         }

     }
       System.out.println(maiorValor2);



    }
    
}
