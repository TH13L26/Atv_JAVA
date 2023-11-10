package aulasjava;

import java.util.Scanner;

public class Atv_4_Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da porcentagem do IPI
        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
        double ipi = scanner.nextDouble();

        // Leitura dos dados da peça 1
        System.out.print("Digite o código da peça 1: ");
        int codigo1 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite a quantidade de peças 1: ");
        int quant1 = scanner.nextInt();

        // Leitura dos dados da peça 2
        System.out.print("Digite o código da peça 2: ");
        int codigo2 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Digite a quantidade de peças 2: ");
        int quant2 = scanner.nextInt();

        // Cálculo do valor total
        double valorTotal = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        // Apresentação do resultado
        System.out.println("O valor total a ser pago é: " + valorTotal);

    }
}
