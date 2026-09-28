package Estruturas.Repetitivas.While;

import java.util.Scanner;

public class Exercicio_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;
        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println(soma);
        sc.close();
    }
}
