import java.util.Scanner;

public class LivrariaFIAP {
    public static void main(String[] args) {
        //Instanciando um objeto => criar o objeto na memória
        //tipoObjeto nomeObjeto = operadorInstanciação construtor;
        Scanner readString = new Scanner(System.in);
        Scanner readNumber = new Scanner(System.in);
        Livro book = new Livro();

        System.out.println("Qual é o seu nome?");
        book.reader = readString.nextLine();

        System.out.println("Qual é o seu livro book " + book.reader + "?");
        book.title = readString.nextLine();

        System.out.println("Quem é o autor desse livro?");
        book.author = readString.nextLine();

        System.out.println("Qual é a editora que publicou esse livro?");
        book.company = readString.nextLine();

        System.out.println("Faça um breve resumo desse livro:");
        book.summary = readString.nextLine();

        System.out.println("Qual é o tipo de capa desse livro?");
        book.coverType = readString.nextLine();

        System.out.println("Quanto custa esse livro?");
        book.value = readNumber.nextDouble();

        System.out.println(book.exibirDados());
//        System.out.println("O livro book de " + book.readString + " é: " + book.titulo + "!");
    }
}