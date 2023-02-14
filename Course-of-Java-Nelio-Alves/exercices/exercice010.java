/*
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
 */

import java.util.Scanner;

public class exercice010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.print("Digite dois números separados por espaços: ");
        A = sc.nextInt();
        B = sc.nextInt();

        if ((A % 2) == 0 & (B % 2) == 0 || (A % 3) == 0 & (B % 3) == 0) {
            System.out.println("São multiplos.");
        }

        else {
            System.out.println("Não são multiplos.");
        }

        sc.close();
    }
}
