import java.util.Scanner;

public class Moeda {
    public double valorReal;
    public double cotacaoDolar;
    public double quantidadeDolar;

    public void calcularConversaoDolar(){
        this.quantidadeDolar = this.valorReal / this.cotacaoDolar;
        //System.out.println("O valor ficou em: " + this.quantidadeDolar);
    };

    public void calcularConversaoReal(){
        this.valorReal = this.quantidadeDolar * this.cotacaoDolar;
       // System.out.println("O valor ficou em: " + this.valorReal);
    };

    public void calcularConversaoDolarCotacao(double cotacao){
        this.quantidadeDolar = this.valorReal / cotacao;
        System.out.println("O valor ficou em: " + this.quantidadeDolar);
    };

    public String comprarDolar(String nome, String cpf){
        this.calcularConversaoDolar();
        return "O cliente com o cpf: " + cpf +" \nNome: " + nome + " comprou $" + this.quantidadeDolar + " com R$" + this.valorReal;
    }

    public String comprarReal(String nome, String cpf){
        this.calcularConversaoReal();
        return "O cliente com o cpf: " + cpf +" \nNome: " + nome + " comprou R$" + this.valorReal + " com $" + this.quantidadeDolar;
    }
}