/*
 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */

import java.util.Scanner;

public class exercice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double entry;

        System.out.print("Digite um número: ");
        entry = sc.nextDouble();

        if (entry >= 0 && entry < 25) {
            System.out.println("INTERVALO: 0 a 24");
        }

        else if (entry >= 25 && entry < 50) {
            System.out.println("INTERVALO: 25 a 49");
        }

        else if (entry >= 50 && entry < 75) {
            System.out.println("INTERVALO: 50 a 74");
        }

        else if (entry >= 75 && entry < 100) {
            System.out.println("INTERVALO: 75 a 100");
        }

        else {
            System.out.println("Fora de intervalo.");
        }

        sc.close();
    }
}
