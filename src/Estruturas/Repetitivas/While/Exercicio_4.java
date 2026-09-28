package Estruturas.Repetitivas.While;

import java.util.Scanner;

public class Exercicio_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1){
                gasolina += 1;
            } else if (tipo == 2) {
                alcool += 1;
            } else if (tipo == 3) {
                diesel += 1;
            }
            tipo = sc.nextInt();
        }

        System.out.println("Muito obrigado");
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Alcool: " + alcool);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
