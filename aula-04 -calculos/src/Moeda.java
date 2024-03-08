import java.util.Scanner;

public class Moeda {
    public double valorReal;
    public double cotacaoDolar;
    public double quantidadeDolar;

    public void calcularConversaoDolar(){
        this.quantidadeDolar = this.valorReal / this.cotacaoDolar;
        System.out.println("O valor ficou em: " + this.quantidadeDolar);
    };

    public void calcularConversaoReal(){
        this.valorReal = this.quantidadeDolar * this.cotacaoDolar;
        System.out.println("O valor ficou em: " + this.valorReal);
    };
}