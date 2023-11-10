package aulasjava;
import java.util.Scanner;

public class Atv_3_Java {
    public static void main(String[] args){

        int salario;
        Scanner valor = new Scanner(System.in);

        System.out.println("Informe o seu salário:");
        salario = valor.nextInt();

        double reajuste = salario * 0.01;

        double soldoReajuste = salario + reajuste;

        System.out.println("O sálario mais o reajuste ficou por: " + soldoReajuste);


    }
}
