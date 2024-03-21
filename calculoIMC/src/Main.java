import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);
        Scanner readString = new Scanner(System.in);

        System.out.println("*************** Calculadora IMC ***************");
        System.out.print("Digite a sua altura:");
        double altura = readNumber.nextDouble();

        System.out.print("Digite o seu peso:");
        double peso = readNumber.nextDouble();

        Calculo calc = new Calculo(peso, altura);
        System.out.println(calc.exibirMensagem());

        String sexo;
        boolean confirm = true;
        while (confirm){
            System.out.println("Informe o seu sexo, para sabermos o seu peso ideal: (M/F)");
            sexo = readString.nextLine();

            if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")){
                System.out.println("O peso ideal para seu sexo é de: " + calc.pesoIdeal(sexo));
                confirm = false;
            }else{
                System.out.println("Sexo inválido, voltando á pergunta novamente.");
            }
        }

    }
}