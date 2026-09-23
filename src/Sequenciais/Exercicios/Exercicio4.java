package Sequenciais.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario;
        numeroFuncionario = sc.nextInt();

        double horasTrabalhadas;
        horasTrabalhadas = sc.nextDouble();

        double salario;
        salario = sc.nextDouble();

        double salarioFinal;
        salarioFinal = salario * horasTrabalhadas;

        System.out.printf("Number = %d%nSalary = U$ %.2f", numeroFuncionario, salarioFinal);
        sc.close();
    }
}
