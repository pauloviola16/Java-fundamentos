package secao8;

public class PessoaImutavel {

    // É POSSIVEL PEGAR OS DADOS VIA GET, MAS NÃO É POSSIVEL ALTERAR DADOS
    private final String nome;
    private final int idade;


    public PessoaImutavel (String nome, int idade){

        this.nome = nome;
        this.idade = idade;
    }


    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
    

    
}
