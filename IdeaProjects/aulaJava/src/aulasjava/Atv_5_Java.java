package aulasjava;
import java.util.Scanner;

public class Atv_5_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        // Leitura do salário do usuário
        System.out.print("Digite o valor do salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();

        // Cálculo da quantidade de salários mínimos
        double qtdSalariosMinimos = salarioUsuario / salarioMinimo;

        // Apresentação do resultado
        System.out.println("O usuário ganha " + qtdSalariosMinimos + " salários mínimos.");

    }
}
