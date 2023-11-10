package aulasjava;
import java.util.Scanner;

public class TesteJava {
    public static void main(String[] args){
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        int numero6;
        int divisao;
        int multiplica;
        int soma;

        Scanner valor = new Scanner(System.in);

        System.out.println("Entre com um número a ser somado: ");
        numero1 = valor.nextInt();

        System.out.println("Entre com o segundo número a ser somado: ");
        numero2 = valor.nextInt();

        soma = numero1 + numero2;

        System.out.println("O resultado da soma do " + numero1 + " + " + numero2 + " é = " + soma);

        //************************************************************************************************


        Scanner multi = new Scanner(System.in);

        System.out.println("Entre com um número a ser multiplicado: ");
        numero3 = multi.nextInt();

        System.out.println("Entre com o segundo número a ser multiplicado: ");
        numero4 = multi.nextInt();

        multiplica = numero3 * numero4;

        System.out.println("O resultado da multiplicação do " + numero3 + " * " + numero4 + " é = " + multiplica);

        //************************************************************************************************

        Scanner divi = new Scanner(System.in);

        System.out.println("Entre com um número a ser dividido: ");
        numero5 = divi.nextInt();

        System.out.println("Entre com o segundo número a ser dividido: ");
        numero6 = divi.nextInt();

        divisao = numero5 / numero6;

        System.out.println("O resultado da divisão do " + numero5 + " * " + numero6 + " é = " + divisao);


    }
}
