import java.util.Scanner;

public class SystemDev {
    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);
        int action;

        System.out.println("Bem vindo ao sistema !");

        System.out.println("O que você quer fazer:");
        System.out.println("(1) - Calculadora");
        System.out.println("(2) - Cadastrar pessoa");
        action = readNumber.nextInt();

        if(action == 1){
            Matematica calc = new Matematica();
            calc.calculadora();
        }else if(action == 2) {
            Pessoa person = new Pessoa();
            person.cadastrarPessoa();
        }else{
            System.out.println("Erro, ação inexistente");
        }
    }
}
