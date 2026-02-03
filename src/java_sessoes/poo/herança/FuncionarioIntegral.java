package secao10;

public class FuncionarioIntegral extends Funcionario implements Beneficios {

    private double salarioBase;

    public FuncionarioIntegral(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
   
    }
    
    @Override
    public double calcularSalario(){
        return salarioBase;
    }

    @Override
    public void adicionarBeneficio(String beneficio) {
        System.out.println("Benefício adicionado ao funcionário tempo integral " + nome + ": " + beneficio);
}
}
    

