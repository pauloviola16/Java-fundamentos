package secao10;

public class Endereco {

    String rua;
    String cidade;
    int numero;

    public Endereco (String rua, String cidade, int numero){
        this.cidade = cidade;
        this.rua = rua; 
        this.numero = numero;
    }

    public String exibirEndereco(){
        return rua + ", " + numero + " - " + cidade;
    }

}
