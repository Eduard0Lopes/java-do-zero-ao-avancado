package POO.Exercicio_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Digite as medidas do X do triangulo");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite as medidas do Y do triangulo");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangulo X: %.4f%n", areaX);
        System.out.printf("Triangulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior area é a do: X");
        } else {
            System.out.println("Maior area é do Y");
        }

        sc.close();
    }
}
