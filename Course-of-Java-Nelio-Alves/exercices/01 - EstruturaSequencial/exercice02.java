/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
 * valor da área deste círculo com quatro casas decimais conforme exemplos.
 * 
 * Fórmula da área: area = pi . raio2
 * Considere o valor de pi = 3.14159
 */

import java.util.Scanner;

public class exercice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio;

        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("%nO valor da área deste cŕculo é de: %.4f%n", area);

        sc.close();
    }
}