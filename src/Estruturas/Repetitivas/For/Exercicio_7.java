package Estruturas.Repetitivas.For;

import java.util.Scanner;

public class Exercicio_7 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fat = 1;
        for (int i=1; i<=n; i++) {
            fat *= i;
        }

        System.out.println(fat);

        sc.close();
    }
}
