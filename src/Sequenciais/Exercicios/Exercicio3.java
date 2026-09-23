package Sequenciais.Exercicios;
import java.util.*;
public class Exercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        int diferenca;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        diferenca = (A * B - C * D);
        System.out.println("Diferença: " + diferenca);
        sc.close();
    }
}
