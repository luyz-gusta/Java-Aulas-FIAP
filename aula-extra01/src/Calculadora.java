import java.util.Scanner;

public class Calculadora {

    public void imc() {
        Scanner readNumber = new Scanner(System.in);

        System.out.println("******************** Calculadora IMC ********************");

        System.out.print("Digite o peso: ");
        double weight = readNumber.nextDouble();

        System.out.print("Digite a altura: ");
        double height = readNumber.nextDouble();

        double imc = calcImc(weight, height);

        if (imc < 18.5) {
            System.out.println("\n********** Você está abaixo do peso **********");
        } else if (imc > 18.5 && imc < 24.99) {
            System.out.println("\n**********Você está normal **********");
        } else if (imc > 25 && imc < 30) {
            System.out.println("\n********** Você está sobrepeso **********");
        } else {
            System.out.println("\n********** Você está obeso **********");
        }
    }

    public double calcImc(double weight, double height) {

        return weight / (height * height);
    }
}
