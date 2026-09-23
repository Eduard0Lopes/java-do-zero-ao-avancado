package Sequenciais.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numeroPecasA, numeroPecasB;
        double valorPecaA, valorPecaB, total;

        numeroPecasA = sc.nextInt();
        valorPecaA = sc.nextDouble();

        numeroPecasB = sc.nextInt();
        valorPecaB = sc.nextDouble();

        total = numeroPecasA * valorPecaA + numeroPecasB * valorPecaB;

        System.out.printf("Valor a pagar: R$ %.2f", total);

        sc.close();
    }
}
