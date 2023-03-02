/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

import java.util.Scanner;

public class exercice08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Digite a hora inicial e final do jogo: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a < 24 && b < 24 && a == b) {
            System.out.println("O jogo durou 24 horas.");
        }

        else if (a < 24 && b < 24 && a < b) {
            System.out.printf("O jogo durou %d horas.%n", b - a);
        }

        else if (a < 24 && b < 24 && a > b) {
            System.out.printf("O jogo durou %d horas.%n", (24 - a) + b);
        }

        sc.close();
    }
}
