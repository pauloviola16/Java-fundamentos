package java_sessoes.metodosarrays;

import java.util.Arrays;
import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {
        
        // sintaxe arrays
        int[] numeros = {1,2,3,4,5,6,7,8};

        System.out.println(" Acessando primeiro elemento " + numeros[0]);


        // tamanho fixo só que vazio
        String[] frutas = new String[3];

        frutas[0] = "Banana";
        frutas[1] = "Maça";
        frutas[2] = "Melão";


        double[] precos = {1.99, 2.34, 5.00};
        System.out.println(precos[2]);


       // loops em arrays

       // somar elementos de um array, arrays numeros
         int soma = 0;

         for(int i = 0; i < numeros.length; i++){
   
             soma += numeros[i];

         }

         System.out.println("Soma dos elementos " + soma);

       
         // for each
         // Nomear o item -> array
         // Frutas -> fruta

        // EX 1
         for(String fruta : frutas){
            System.out.println("A fruta da vez é: " + fruta);
         }
       
         // EX 2
         for(int numero : numeros){
            System.out.println("O número é: " + numero);
         }


         // CONCATENANDO PALAVRAS COM FOR EACH
          String[] palavras = {"Java", "é", "bom!"};

          String frase = "";

          for (String palavra : palavras){
            frase += palavra + " ";
          }

          System.out.println(frase);


          // VERIFICAR SE O VALOR ESTÁ PRESENTE NO ARRAY

          char[] letras = {'a', 'e', 'i', 'o', 'u'};

          char letraEncontrada = 'i';

          for(char letra : letras){

            if (letra == letraEncontrada) {

                System.out.println("Elemento encontrado: " + letra);
                break;
            }
          }


           // loops com if

           // filtrar e somar numeros pares (utilizado o array da linha 8)

           int somaPares = 0;

           for( int numero : numeros){

            if (numero % 2 == 0) {

                somaPares += numero;
                
            }
           }

        System.out.println("A soma dos números pares é: " + somaPares);

         // Exibir valores maiores que um determinado valor

         int[] nums = {12 , 4, 13, 33, 42 ,100};

         int limite = 10;

         for (int i = 0; i < nums.length; i++){

            if (nums[i] > limite) {
                System.out.println("numero encontrado: " + nums[i]);

            }
         }

         // ATUALIZAR VALOR DO ARRAY (UTILIZANDO O ARRAY NUMEROS)

         for(int i = 00; i < numeros.length; i ++){

            // multiplicando todos os elementos por 2
            numeros[i] *= 2;
 
         }

         for (int numero : numeros){
            System.out.println(" Números dobrados: " + numero);
         }

         // ALTERAR UM VALOR DIRETAMENTE
         numeros [5] = 1;
            
         // ALTERAR O VALOR DE UMA FRUTA
         for(int i = 0; i < frutas.length; i++){

            if (frutas[i].equals("Maça")) {

                frutas[i] = "Abacate";
                
            }

         }


        // Metodo toString

       String dadosNumericos = Arrays.toString(numeros);

       System.out.println(dadosNumericos);


    // Adicionar novos itens a Arrays

    // EX1 CRIANDO UM NOVO ARRAY MAIOR E COPIANDO OS ELEMENTOS

       int [] novoArray = new int[numeros.length + 1];

       for (int i = 0; i < numeros.length; i++){

               novoArray[i] = numeros [i];

       }
         System.out.println(Arrays.toString(novoArray));

         // ATRIBUINDO UM VALOR AO ULTIMO ELEMENTO 
         novoArray[novoArray.length - 1] = 23;

         
         // EX 2 UTILIZANDO ARRAYCOPY PARA COPIAR OS ELEMENTOS

        String [] novasFrutas = new String[frutas.length + 1];

        System.arraycopy(frutas, 0, novasFrutas, 0, frutas.length);

        novasFrutas[novasFrutas.length - 1] = "Jaca";

        System.out.println(Arrays.toString(novasFrutas));



       // EX 3 USANDO ARRAYLIST


        // criando o array de frutas
      ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maça", "Banana", "Laranja"));

      System.out.println(listaFrutas);

      // adicionado elementos
      listaFrutas.add("Melão");



      // REFERENCE TRAP

      int[] arrayOriginal = {1,2,3};

      // programou bastante coisa e quis reutilizar o array

      int[] arrayCopia = arrayOriginal;


      // troca o valor tanto no copia tanto no original
      arrayCopia[0] = 10;

      // como evitar isso
      // utilizar o arrayClone
      int[] arrayClone = arrayOriginal.clone();

      // muda apenas o valor no arrayClone, mantendo o valor no arrayOriginal
      arrayClone[0] = 10;



      // Arrays 2d, Matrizes

      int[][] matriz = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
      };
         
      // O PRIMEIRO INDICE SELECIONADO É A MATRIZ ESCOLHIDA E O SEGUNDO É O ELEMENTO DA MATRIZ
      System.out.println(matriz[1][2]);


      // CRIANDO ARRAY 2D VAZIO E PREENCHENDO

      int[][] tabela = new int[3][3]; // 3 arrays, com 3 elementos cada

      tabela [0][1] = 10; // primeiro array, segundo elemento = 10
      tabela [2][0] = 30; // terceiro array, primeiro elemento = 30

      for(int[] linha : tabela){
        System.out.println(Arrays.toString(linha));
      }


      int[][] grade = new int[4][5]; // 4 arrays, com 5 elementos cada

        for(int m = 0; m < grade.length; m++){
            for(int n = 0; n < grade[m].length; m++){
                grade[m] [n] = m * n;
            }

            for(int[] linha : grade){
        System.out.println(Arrays.toString(linha));
      }
        }

    }
    
}
