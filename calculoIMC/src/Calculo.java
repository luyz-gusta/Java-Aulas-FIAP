import java.text.DecimalFormat;

public class Calculo {

    public double peso;
    public double altura;

    public Calculo(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(){
        return this.peso / Math.pow(this.altura, 2);
    }

    public String exibirMensagem(){
        double imc = calcularIMC();
        String meng;

        DecimalFormat fmt = new DecimalFormat("0.00");
        String imcFormat = fmt.format(imc);

        if(imc <= 18.5){
            meng = "Abaixo do peso";
        }else if(imc > 18.5 && imc <= 25){
            meng = "Peso ideal (parabéns)";
        }else if(imc > 25 && imc <= 30){
            meng = "Levemente acima do peso";
        }else if(imc > 30 && imc <= 35){
            meng = "Obesidade grau I";
        }else if(imc > 35 && imc <= 40){
            meng = "Obesidade grau II (severa)";
        }else{
            meng = "Obesidade III (mórbida)";
        }

        return "Seu IMC é de " + imcFormat + " você está " + meng;
    }

    public double pesoIdeal(String sexo){
        double pesoIdeal;

        if(sexo.equalsIgnoreCase("m")){
            pesoIdeal = 52 + (0.75 * (this.altura - 152.4));
        }else{
            pesoIdeal = 52 + (0.67 * (this.altura - 152.4));
        }

        return pesoIdeal;
    }
}
