package Estruturas.Repetitivas.While;

import java.util.Scanner;

public class Exercicio_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2000) {
            System.out.print("Senha inválida... tente novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");
        sc.close();
    }
}
