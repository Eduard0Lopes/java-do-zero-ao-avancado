package Estruturas.Condicionais;

import java.util.Scanner;

public class Exercicio_10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x;
        String dia;
        System.out.print("Digite um dia: ");
        x = sc.nextInt();

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;

            default:
                dia = "valor invalido";

        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
