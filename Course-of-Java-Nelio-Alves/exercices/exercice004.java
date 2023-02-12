/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

import java.util.Scanner;

public class exercice004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        c = sc.nextInt();

        System.out.print("Digite o quarto número: ");
        d = sc.nextInt();

        System.out.printf("Diferença: %d . %d - %d . %d = %d%n", a, b, c, d, a * b - c * d);
        sc.close();
    }
}
