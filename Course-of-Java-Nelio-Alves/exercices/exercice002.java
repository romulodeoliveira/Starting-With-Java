/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
 */

import java.util.Scanner;

public class exercice002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Digite o primeiro número da soma: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo número da soma: ");
        b = sc.nextInt();

        System.out.printf("A soma %d + %d = %d%n", a, b, a + b);

        sc.close();
    }
}
