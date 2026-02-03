package secao10;

public class Exercicios {
    public static void main(String[] args) {

        //exercicio 1
        // Criar uma classe Pessoa com os atributos nome, idade e endereço.
        // O endereço deve ser representado por uma classe separada chamada Endereco,
        // que possui os atributos rua, cidade e número.
        // Implemente métodos para exibir as informações da pessoa, incluindo o endereço completo.
        
         Pessoa Paulo = new Pessoa("Paulo", 21, new Endereco("Gustavo Corção", "Rio de Janeiro", 360));
         Paulo.exibirInfo();
         

        /* Exercício 2: Herança e Sobrescrita de Métodos (Overriding)
    
    Enunciado: Crie uma classe Veiculo com o método acelerar() que exibe a mensagem "O veículo está acelerando". 
    Crie duas subclasses, Carro e Moto, que herdem de Veiculo. 
    Na subclasse Carro, sobrescreva o método acelerar() para exibir "O carro está acelerando". 
    Na subclasse Moto, sobrescreva o método para exibir "A moto está acelerando". 
    Crie uma classe principal e teste o polimorfismo com os diferentes tipos de veículos.*/

     Veiculo carro = new Carro();
     Veiculo moto = new Moto();

     carro.acelerar(); 
     moto.acelerar();  
     
     /*  Exercício 3: Uso do Método super
    
    Enunciado: Crie uma classe base Animal com atributos como nome e som, 
    além de um construtor que inicialize esses atributos. 
    Crie uma subclasse Cachorro que, além de herdar de Animal, tenha um atributo raca. 
    No construtor de Cachorro, use a palavra-chave super para chamar o construtor da classe Animal e 
    inicializar nome e som. Crie um método exibirDetalhes() que exibe o nome, o som e a raça do cachorro. */
 

    Cachorro dog = new Cachorro("thor", "Auau", "vira-lata");
    dog.exibirDetalhes();


/*   Exercício 4: Classe Abstrata e Interface

    Enunciado: Crie uma classe abstrata Funcionario com um atributo nome e um método abstrato calcularSalario(). 
    Crie duas subclasses, FuncionarioTempoIntegral e FuncionarioMeioPeriodo, 
    que implementam o método calcularSalario(). 
    Além disso, crie uma interface Beneficios com um método adicionarBeneficio(). 
    As duas subclasses devem implementar essa interface, adicionando diferentes benefícios a cada tipo de funcionário. */


    FuncionarioIntegral func1 = new FuncionarioIntegral("Carlos", 5000);
    FuncionarioMeioPeriodo func2 = new FuncionarioMeioPeriodo("Ana", 50, 80);

    System.out.println("Salário do funcionário integral: " + func1.calcularSalario());
    func1.adicionarBeneficio("Plano de Saúde");

    System.out.println("Salário do funcionário meio período: " + func2.calcularSalario());
    func2.adicionarBeneficio("Vale Transporte");



    /*  > Exercício 5: Implementação de Múltiplas Interfaces e Polimorfismo

    Enunciado: Crie duas interfaces: Pilotavel com o método pilotar(), e Navegavel com o método navegar(). 
    Crie uma classe Barco que implementa a interface Navegavel 
    e uma classe Aviao que implementa a interface Pilotavel. 
    Agora, crie uma classe Hidroaviao que herda de Barco e implementa tanto Pilotavel quanto Navegavel.
    Na classe principal, use polimorfismo para criar uma função operarVeiculo() 
    que aceite tanto Navegavel quanto Pilotavel e execute os métodos corretos com base no tipo de objeto passado.

 */

     Navegavel barco = new Barco();
     Pilotavel aviao = new Aviao();

     barco.navegar(); 
     aviao.pilotar();

    operarVeiculo(barco);

    }

    public static void operarVeiculo(Object veiculo){
        if (veiculo instanceof Pilotavel) {
            System.out.println("O veículo pode ser pilotado.");
        }
        if (veiculo instanceof Navegavel) {
            System.out.println("O veículo pode ser navegado.");
        }
    }

}
