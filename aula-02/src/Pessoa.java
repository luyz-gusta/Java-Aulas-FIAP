import java.util.Scanner;

public class Pessoa {
    String nome;
    String email;
    int idade;

    public String getPessoa(){
        return "\n"+ "Dados:\n" + "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "Idade: " + idade + "\n";
    }

    public void cadastrarPessoa(){
        Scanner readString = new Scanner(System.in);
        Scanner readNumber = new Scanner(System.in);

        System.out.println("Bem vindo ao cadastro de pessoas !");

        System.out.print("Digite o nome: ");
        this.nome = readString.nextLine();

        System.out.print("Digite o email: ");
        this.email = readString.nextLine();

        System.out.print("Digite o idade: ");
        this.idade = readNumber.nextInt();

        System.out.println(getPessoa());
    }
}
