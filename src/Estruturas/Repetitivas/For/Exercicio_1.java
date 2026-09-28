package Estruturas.Repetitivas.For;

import java.util.Scanner;

public class Exercicio_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros irá ler? ");
        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);
        sc.close();
    }
}
