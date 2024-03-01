import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa luiz = new Pessoa();

        System.out.println("Bem vindo ao Sistema, digite seus dados:");

        System.out.println("Nome:");
        luiz.nome = ler.nextLine();

        System.out.println("Idade:");
        luiz.idade = ler.nextInt();

        System.out.println("Email:");
        luiz.email = ler.next();

        System.out.println("Salario:");
        luiz.salario = ler.nextDouble();

        System.out.println("Seus dados:");
        System.out.println("Nome:" + luiz.nome);
        System.out.println("Idade:" + luiz.idade);
        System.out.println("Email:" + luiz.email);
        System.out.println("Salario:" + luiz.salario);

    }
}

