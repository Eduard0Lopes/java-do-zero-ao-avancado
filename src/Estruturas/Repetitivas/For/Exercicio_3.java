package Estruturas.Repetitivas.For;

import java.util.Scanner;

public class Exercicio_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i=1; i<=x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
