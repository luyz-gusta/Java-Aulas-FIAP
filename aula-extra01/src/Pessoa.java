import java.time.LocalDate;
import java.util.Scanner;

public class Pessoa {

    private String name;
    private String email;
    private LocalDate birth;

    public void getData(){
        System.out.println("\nDADOS: \nNome: " + name +
                "\nEmail: " + email + "\nData de Nascimento: " + birth);
    }

    public void createPerson(){
        Scanner readString = new Scanner(System.in);

        System.out.println("******************** Criar Pessoa Física ********************");
        System.out.print("Digite o nome: ");
        String name = readString.nextLine();

        System.out.print("Digite o email: ");
        String email = readString.nextLine();

        System.out.print("Digite a data de nascimento: ");
        String birth = readString.nextLine();
    }
}
