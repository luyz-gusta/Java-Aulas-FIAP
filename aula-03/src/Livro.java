public class Livro {
    //-- Atributos
    //public(+) TipoDado nomeAtributoOuVariavel
    public String reader;
    public String title;
    public String author;
    public String company;
    public String summary;
    public String coverType;
    public int paginas;
    public double value;

    public Livro(){}

    public Livro(String title){
        this.title = title;
    }

    public String exibirDados(){
        String dados =
                "-----------------" +
                "\nTitulo: " + this.title +
                "\nResumo: " + this.summary +
                "\nPreço: R$ " + this.value +
                "\nPáginas: " + this.paginas +
                "\nAutor: " + this.author +
                "-----------------";

        return dados;
    }
}
