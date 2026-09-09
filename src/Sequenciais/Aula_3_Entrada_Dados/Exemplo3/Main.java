package Sequenciais.Aula_3_Entrada_Dados.Exemplo3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();
        System.out.printf("Você Digitou: %.2f%n",x);
        sc.close();
    }
}
