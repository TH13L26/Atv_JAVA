package aulasjava;
import java.util.Scanner;

public class Atv_6_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Cálculo do antecessor e sucessor
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Apresentação do resultado
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Número: " + numero);
        System.out.println("Sucessor: " + sucessor);

    }
}
