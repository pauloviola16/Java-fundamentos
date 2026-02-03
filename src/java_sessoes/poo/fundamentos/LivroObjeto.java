package secao8;

public class Livro {
    

    private String titulo;
    private String autor;
    private double preco;

    //Já colocando os valores

    /*  public Livro(){
        this.titulo = "Titulo teste";
        this.autor = "Autor teste";
        this.preco = 19.99;

    } */

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;

    }


   public void exibirInfo(){
       System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", preço: " + preco);

   }









}
