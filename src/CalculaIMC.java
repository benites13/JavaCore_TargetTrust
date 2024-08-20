import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args) {
        Scanner inputTeclado = new Scanner(System.in);
        System.out.print("Informar altura: ");
        float altura = inputTeclado.nextFloat();
        System.out.print("Informar peso: ");
        float peso = inputTeclado.nextFloat();

        float valorIMC = peso / (altura * altura);

        String resultadoIMC = String.format("%.2f", valorIMC);
        String classificacao = "";

        if(valorIMC < 18.5){
            classificacao = "Magreza";
        }else if(valorIMC >= 18.5 && valorIMC < 24.9){
            classificacao = "Normal";
        }else if(valorIMC >= 25 && valorIMC < 29.9){
            classificacao = "Sobrepeso";
        }else if(valorIMC >= 30 && valorIMC < 39.9){
            classificacao = "Obesidade";
        }else if(valorIMC >= 40){
            classificacao = "Obesidade Grave";
        }

        System.out.print(resultadoIMC + ": " + classificacao);

        inputTeclado.close();
    }
}