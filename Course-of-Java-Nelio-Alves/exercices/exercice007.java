/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
 * 
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 */

import java.util.Scanner;

public class exercice007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        double pi = 3.14159;

        System.out.print("Digite três valores com ponto flutuante: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        System.out.printf("""
                %nTRIANGULO: %.3f
                CIRCULO: %.3f
                TRAPEZIO: %.3f
                QUADRADO: %.3f
                RETANGULO: %.3f%n
                    """, A * C / 2, pi * Math.pow(C, 2), (A + B) * C / 2, Math.pow(B, 2), A * B);
        sc.close();
    }
}
