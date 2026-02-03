package secao8;

public class Carro {

    public static void main(String[] args) {
        
    }

    // atributos ou propriedades
       String marca;
       String modelo;
       int ano;

       double velocidadeAtual = 0;
       boolean motorLigado = false;


    // métodos

    void acelerar(){
        System.out.println("O carro está acelerando: ");
    }

    void exibirInfo(){
        System.out.println("Marca: " + marca + "modelo: " + modelo + "ano: " + ano);
    }
    
   void ligarMotor(){
    if (!motorLigado) {

        motorLigado = true;
        System.out.println("Ligando o motor");

    } else{
        System.out.println("O motor já está ligado");
    }
   }


   void aumentarVelocidade(double incremento){
         if (motorLigado) {

            velocidadeAtual =+ incremento;

            System.out.println("A velocidade atual é: " + velocidadeAtual);

         } else{
            System.out.println("Precisa ligar o motor");
         }

   }
  
 }






