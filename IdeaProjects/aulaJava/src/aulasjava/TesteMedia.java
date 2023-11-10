package aulasjava;

import java.util.Scanner;

public class TesteMedia {
    public static void main(String[] args){
        float M1;
        float M2;
        float M3;
        float M4;

        float media;

        Scanner valor = new Scanner(System.in);

        System.out.println("Primeira média: ");
        M1 = valor.nextInt();

        System.out.println("Segunda média: ");
        M2 = valor.nextInt();

        System.out.println("Terceira média: ");
        M3 = valor.nextInt();

        System.out.println("Quarta média: ");
        M4 = valor.nextInt();

        media = (M1 + M2 + M3 + M4) / 4 ;

        System.out.println("O resultado da média é " + media);

        if (media >= 6){
            System.out.println("Aprovado");
        } else if (media <=6){
            System.out.println("Aluno recuperação");
        } else {
            System.out.println("Aluno Reprovado");
        }
        }
    }

