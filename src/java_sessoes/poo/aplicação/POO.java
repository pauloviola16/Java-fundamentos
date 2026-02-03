package secao8;

public class POO {

    public static void main(String[] args) {
        
         // criar classe (carro)

        // 2 - instanciar a classe

    Carro fusca = new Carro();

    fusca.marca = "Fiat";
    fusca.modelo = "Fusca";
    fusca.ano = 1970;

   

    fusca.acelerar();
    fusca.exibirInfo();
     

    //Métodos

    fusca.ligarMotor();

    fusca.aumentarVelocidade(30);

 

    //Criando propriedades

    Pessoa joao = new Pessoa();

    joao.setNome("João");

    System.out.println("O nome dele é: " + joao.getNome());

    joao.setIdade(21);

    System.out.println("A idade de João é: " + joao.getIdade());


    // Setters

    ContaBancaria ContaDoPaulo = new ContaBancaria();

    ContaDoPaulo.setTitular("Paulo");

    ContaDoPaulo.setSaldo(1000);

    ContaDoPaulo.exibirInfo();

    System.out.println(ContaDoPaulo.getTitular());

    System.out.println(ContaDoPaulo.getSaldo());

    // Logica em get e set

    Produto camisa = new Produto();

    camisa.setNome("Regata");

    System.out.println(camisa.getNome());

    camisa.setPreco(109.99999);

    System.out.println("O valor da camisa é: " + camisa.getPreco());

    //Método dentro de método
    System.out.println(camisa.getProdutoInfo());

    camisa.aplicarDesconto(10);



    // Construtores

    Livro meuLivro = new Livro("Harry Potter", "J K",199.00);

    meuLivro.exibirInfo();


    }
}
