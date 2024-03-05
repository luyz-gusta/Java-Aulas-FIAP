import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner readNumber = new Scanner(System.in);
        Scanner readString = new Scanner(System.in);
        Calculadora math = new Calculadora();
        Pessoa person = new Pessoa();

        System.out.println("******************** Bem vindo ao sistema ********************");

        System.out.println("Escolha a funcionalidade:");
        System.out.println("(1)Calcular IMC  (2)Cadastrar Pessoa Física");
        System.out.print("Valor: ");
        int option = readNumber.nextInt();

        if (option == 1) {
            math.imc();
        } else {
            person.getData();
        }
    }
}