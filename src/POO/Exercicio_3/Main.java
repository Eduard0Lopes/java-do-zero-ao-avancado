package POO.Exercicio_3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.print("Enter rectangle width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();
        System.out.printf("\nArea: %.2f", rect.area());
        System.out.printf("\nPerimeter: %.2f" , rect.perimeter());
        System.out.printf("\nDiagonal: %.2f", rect.diagonal());
        sc.close();
    }
}
