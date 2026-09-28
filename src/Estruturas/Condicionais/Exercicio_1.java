package Estruturas.Condicionais;
import java.util.Scanner;
public class Exercicio_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero;
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Não Negativo");
        }
        sc.close();
    }
}
