package Estruturas.Condicionais;

import java.util.Scanner;

public class Exercicio_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
