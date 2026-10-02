package JavaLista2;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Integer temperatura;
        System.out.println("Informe a temperatura ambiente para que o sistema de refrigeramento automático controle a temperatura interna:");
        Scanner sc = new Scanner(System.in);
        temperatura = sc.nextInt();
        sc.close();
        if (temperatura <= 18) {
            System.out.println("Ligando Aquecedores");
        } else if (temperatura>18&&temperatura<=25) {
            System.out.println("Mantendo temperatura");
        }
        else{
            System.out.println("Ligando Ar condiconado");
        }
    }
}
