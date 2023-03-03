/*
 * Ler um número inteiro N e calcular todos os seus divisores. 
 */

import java.util.Scanner;

public class exercice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.printf("%d é divisível por %d.%n", N, i);
            }
        }

        sc.close();
    }
}
