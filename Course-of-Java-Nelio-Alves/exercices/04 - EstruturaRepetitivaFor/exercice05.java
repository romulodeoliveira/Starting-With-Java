/*
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1. 
 */

import java.util.Scanner;

public class exercice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int N = sc.nextInt();

        System.out.println("Fatorial:");
        for (int i = 1; i < 5; i++) {
            N = N * i;
            System.out.printf("%d x %d | ", N, i);
        }

        System.out.printf("Resultado: %d%n", N);

        sc.close();
    }
}
