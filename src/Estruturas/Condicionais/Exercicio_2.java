package Estruturas.Condicionais;

import java.util.Scanner;

public class Exercicio_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero;
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        sc.close();
    }
}
