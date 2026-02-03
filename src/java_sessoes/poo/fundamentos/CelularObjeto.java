package secao8;

public class Celular {

      String marca;
      String modelo;
      int bateria = 100;


        
      void ligarCelular(){
       System.out.println("Ligando o celular... ");
      }

      void desligandoCelular(){
       System.out.println("Desligando o celular... ");
      }

       void usarBateria(int consumo){
        if (bateria - consumo >= 0) {
            bateria -= consumo;
            System.out.println("A bateria é: " + bateria + "%");

        } else {
            System.out.println("Bateria insuficiente");
        }
       }
      }
    
    

