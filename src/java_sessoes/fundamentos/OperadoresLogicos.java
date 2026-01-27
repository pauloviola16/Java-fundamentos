package java_sessoes.fundamentos;

public class OperadoresLogicos {

    public static void main(String[] args) {
    
   // Operadores Lógicos

         // AND (&&)

            int idade = 18;
            boolean carteiraDeMotorista = true;

             if(idade >= 18 && carteiraDeMotorista == true){

                System.out.println("Pode dirigir");

             }

    
            // OR (||)

            boolean possuiDinheiro = false;
            boolean possuiCartao = true;

             if(possuiDinheiro || possuiCartao){

                System.out.println("Pode fazer a compra");

             }  else {

                System.out.println("Não pode fazer a compra");

             }



            // NOT (!)

            boolean estaChovendo = true;

             if(!estaChovendo){

                System.out.println("Pode sair sem guarda-chuva");

             } else {

                System.out.println("Precisa levar um guarda-chuva");

             }










    }
    
}
