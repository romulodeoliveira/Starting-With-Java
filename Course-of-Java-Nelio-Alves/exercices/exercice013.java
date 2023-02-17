import java.util.Scanner;

/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem “Origem”.

Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
 */

import java.util.Scanner;

public class exercice013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double x, y;

        System.out.print("Digite as coordenadas: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        // Q1
        if (x > 0 && y > 0) {
            System.out.println("Q1");
        }

        // Q2
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }

        // Q3
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }

        // Q4
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }

        else {
            System.out.println("Origem");
        }

        sc.close();
    }
}
