/*
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". 
 */

import java.util.Scanner;

public class exercice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o primeiro número: ");
            int a = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("Divisão impossível.");
            }

            else {
                Double resultado = (double) a / b;
                System.out.printf("O resultado é: %f%n%n", resultado);
            }
        }

        sc.close();
    }
}
