package Sequenciais.Exercicios;
import java.util.*;

public class Exercicio2 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159, area, raio;
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.printf("A: %.4f", area);
        sc.close();
    }
}
