package Sequenciais.Aula_3_Entrada_Dados.Exemplo1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);
        sc.close();
    }
}
