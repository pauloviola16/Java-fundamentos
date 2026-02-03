package secao10;

public class Cachorro extends Animal {

     protected String raca;

    public Cachorro(String nome, String som, String raca){
        super(nome, som);
        this.raca = raca;
        
    }


    public void exibirDetalhes(){
        System.out.println("Nome: " + nome + ", Som: " + som + ", Raça: " + raca);
    }
    
}
