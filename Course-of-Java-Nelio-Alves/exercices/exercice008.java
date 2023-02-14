/*
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */

import java.util.Scanner;

public class exercice008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        if (n > 0 || n == 0) {
            System.out.println("NÃO NEGATIVO.");
        }

        else {
            System.out.println("NEGATIVO.");
        }
        sc.close();
    }
}
