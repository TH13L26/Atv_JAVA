package aulasjava;
import java.util.Scanner;

public class Atv_2_Java {
    public static void main(String[] args){
        int num1 = (7 + 8 + 9) / 3;
        int num2 = (4 + 5 + 6) / 3;
        int media = num1 + num2;

        Scanner valor = new Scanner(System.in);

        System.out.println("O resultado da média de (7, 8, e 9) é: " + num1);
        System.out.println("O resultado da média de (4, 5, e 6) é: " + num2);
        System.out.println("O resultado  soma das médias são: " + num1 + " + " + num2 + " é = " + media);


    }
}
