package Sequenciais.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTriangulo = A * C / 2.0;
        areaCirculo = 3.14150 * C * C;
        areaTrapezio = (A+B) / 2.0 * C;
        areaQuadrado = B * B;
        areaRetangulo = A * B;

        System.out.printf("Triangulo: %.3f%n", areaTriangulo);
        System.out.printf("Circulo: %.3f%n", areaCirculo);
        System.out.printf("Trapezio: %.3f%n", areaTrapezio);
        System.out.printf("Quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Retangulo: %.3f%n", areaRetangulo);
        sc.close();
    }
}
