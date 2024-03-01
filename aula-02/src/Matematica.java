import java.util.Scanner;

public class Matematica {
    public int somar(int valor1, int valor2){
        return valor1 + valor2;
    }

    public int subtrair(int valor1, int valor2){
        return valor1 - valor2;
    }

    public double dividir(int valor1, int valor2){
        return valor1 / valor2;
    }

    public int multiplicar(int valor1, int valor2){
        return valor1 * valor2;
    }

    public void calculadora(){
        Scanner readNumber = new Scanner(System.in);
        int valor1;
        int valor2;
        int operacao;

        System.out.println("Bem vindo a calculadora !");

        System.out.print("Digite o valor 1: ");
        valor1 = readNumber.nextInt();

        System.out.print("Digite o valor 2: ");
        valor2 = readNumber.nextInt();

        System.out.println("Qual operação matemática:");
        System.out.println("(1) - somar");
        System.out.println("(2) - subtrair");
        System.out.println("(3) - dividir");
        System.out.println("(4) - multiplicar");
        operacao = readNumber.nextInt();

        if(operacao == 1){
            System.out.println("O resultado é: " + somar(valor1, valor2) );
        }else if(operacao == 2){
            System.out.println("O resultado é: " + subtrair(valor1, valor2) );
        }else if(operacao == 3){
            System.out.println("O resultado é: " + dividir(valor1, valor2) );
        } else if(operacao == 4){
            System.out.println("O resultado é: " + multiplicar(valor1, valor2) );
        }else {
            System.out.println("\n Sistema deu erro");
        }
    }
}
