import javax.transaction.xa.XAException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);
        Scanner readString = new Scanner(System.in);
        Moeda financia = new Moeda();

        System.out.println("**************** Conversor ****************");
        System.out.println("Escolha a opção:");
        System.out.println("(1) - Conversor de real para dolar");
        System.out.println("(2) - Conversor de dolar para real");

        int option = readNumber.nextInt();
        String nome;
        String cpf;

        if (option == 1) {
            System.out.print("Digite o seu nome: ");
            nome = readString.nextLine();

            System.out.print("Digite o seu cpf: ");
            cpf = readString.nextLine();

            System.out.print("Digite o valor em real: ");
            financia.valorReal = readNumber.nextDouble();

            System.out.print("Digite a cotação do dolar de hoje: ");
            financia.cotacaoDolar = readNumber.nextDouble();

            System.out.println(financia.comprarDolar(nome, cpf));
        } else if (option == 2) {
            System.out.print("Digite o seu nome: ");
            nome = readString.nextLine();

            System.out.print("Digite o seu cpf: ");
            cpf = readString.nextLine();

            System.out.print("Digite o valor em dolar: ");
            financia.quantidadeDolar = readNumber.nextDouble();

            System.out.print("Digite a cotação do dolar de hoje: ");
            financia.cotacaoDolar = readNumber.nextDouble();

            System.out.println(financia.comprarDolar(nome, cpf));
        } else {
            System.out.print("Opção inválida, execute novamente !!");
        }
    }
}