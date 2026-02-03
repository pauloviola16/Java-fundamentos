package secao10;

public class Pessoa {

    String nome;
    int idade;
    Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void exibirInfo(){
        System.out.println("Nome:" + nome + ", Idade: " + idade);
        System.out.println("Endereço: " + endereco.exibirEndereco());
    }
    
}