package Estruturas.Sequenciais.Aula_3_Entrada_Dados.Exemplo4;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        char x;
        x = sc.next().charAt(0);
        System.out.println("Você Digitou: " + x);
        sc.close();
    }
}
