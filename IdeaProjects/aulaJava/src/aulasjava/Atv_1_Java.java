import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Atv_1_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a data de nascimento no formato dd/MM/yyyy: ");
        String dataNascimentoString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, formatter);

        LocalDate dataAtual = LocalDate.now();

        Period periodo = calcularDiferencaDatas(dataNascimento, dataAtual);

        System.out.println("Idade: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
        scanner.close();
    }

    private static Period calcularDiferencaDatas(LocalDate dataNascimento, LocalDate dataAtual) {
        return Period.between(dataNascimento, dataAtual);
    }
}

