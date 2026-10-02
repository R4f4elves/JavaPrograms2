package JavaLista2;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Double valorCompra, valorDesconto;
        System.out.println("Informe o valor da sua compra: ");
        Scanner sc = new Scanner(System.in);
        valorCompra = sc.nextDouble();
        sc.close();
        if (valorCompra > 0 && valorCompra <= 200) {
            valorDesconto = valorCompra - (valorCompra * 0.05);
        } else if (valorCompra > 200 && valorCompra <= 500) {
            valorDesconto = valorCompra - (valorCompra * 0.10);
        } else {
            valorDesconto = valorCompra - (valorCompra * 0.15);
        }

        System.out.println("O valor da sua compra é " + valorDesconto);
    }
}
