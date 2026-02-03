package secao5;

public class funcoes2 {

    //Escopo Global

    static int globalVar = 50;
    
    public static void main(String[] args) {

         // funções com condicionais

         String r1 = verificarAcesso(18, true, false);

         System.out.println(r1);

         String r2 = verificarAcesso(25, true, true);

         System.out.println(r2);


         // Funções com switch 

        System.out.println(diaDaSemana(4));


        // system exit
        verificarAutenticacao("paulo", "1413");

        // A linha abaixo nao sera executada por causa do system exit caso a autenticação falhe
        System.out.println("Linha após verificação de autenticação");


        // escopos 

        // escopo local
        int localVar = 10;
        System.out.println("Valor da variável local: " + localVar);

        // escopo global (linha 5)
        System.out.println("Valor da variável global: " + globalVar);
      
        
    }

     public static String verificarAcesso (int idade, boolean temCarteira , boolean temHistoricoNegativo) {

        if (idade >= 18 && temCarteira && !temHistoricoNegativo) {

            return "Acesso permitido";

        }  else if (idade >= 18 && temCarteira && temHistoricoNegativo) {

            return "Acesso negado por histórico negativo";
        }
        else {
            return "Acesso negado";
        }

     }


    // Funções com switch (se tem return nao precisa por o break)

    public static String diaDaSemana (int dia) {

       switch (dia) {

        case 1: 
            return "Segunda-feira";    
        case 2: 
            return "Terça-feira";    
        case 3: 
             return "Quarta-feira";
       case 4: 
             return "Quinta-feira";
       case 5: 
             return "Sexta-feira";
        case 6: 
             return "Sábado";
        case 7: 
             return "Domingo";

        default:
            return "Dia inválido";
       }
    }
       // System exit

       public static void verificarAutenticacao (String usuario, String senha) {

        if( !usuario.equals("admin") || !senha.equals("1234")) {
            System.exit(1);
            System.out.println("Acesso negado");

        } else {

         System.out.println("Acesso concedido");

        }

    }


  














}
