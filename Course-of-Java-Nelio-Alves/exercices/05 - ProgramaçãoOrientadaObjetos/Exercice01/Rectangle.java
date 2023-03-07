package Exercice01;

import java.util.Scanner;

public class Rectangle {
    Scanner sc = new Scanner(System.in);
    private double width;
    private double height;

    public void area() {
        double A;

        System.out.print("Digite a largura do retângulo: ");
        width = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        height = sc.nextDouble();

        A = width * height;

        System.out.println("A área do retângulo é igual a: " + A);
    }

    public void perimeter() {
        double P;

        System.out.print("Digite a largura do retângulo: ");
        width = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        height = sc.nextDouble();

        P = 2 * (width * height);

        System.out.println("O perímetro do retângulo é igual a: " + P);
    }

    public void diagonal() {
        double D;

        System.out.print("Digite a largura do retângulo: ");
        width = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        height = sc.nextDouble();

        D = Math.pow(height, 2) + Math.pow(width, 2);
        D = Math.sqrt(D);

        System.out.println("A diagonal do retângulo é igual a: " + D);
    }
}
