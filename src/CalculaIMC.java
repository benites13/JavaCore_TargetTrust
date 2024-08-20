import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args) {
        Scanner inputAltura = new Scanner(System.in);
        Scanner inputPeso = new Scanner(System.in);
        System.out.print("Informar altura: ");
        float altura = inputAltura.nextFloat();
        System.out.print("Informar peso: ");
        float peso = inputPeso.nextFloat();

        float valorIMC = peso / (altura * altura);

        String resultadoIMC = String.format("%.2f", valorIMC);

        System.out.print(resultadoIMC);
    }
}