package Sequenciais.Aula_3_Entrada_Dados.Exemplo2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();
        System.out.println("Você Digitou: " + x);
        sc.close();
    }
}
