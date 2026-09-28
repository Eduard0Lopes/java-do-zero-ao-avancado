package Estruturas.Condicionais;

public class Exercicio_11 {
    static void main() {
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    }
}
