package secao10;

abstract class Funcionario {

    protected String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }

    abstract double calcularSalario();
    
}
