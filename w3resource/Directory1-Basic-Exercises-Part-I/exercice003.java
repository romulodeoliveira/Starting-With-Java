
/*
 * Write a Java program to divide two numbers and print on the screen.
 * 
 * Test Data :
 * 50/3
 * Expected Output :
 * 16
 */
import java.util.Scanner;

public class exercice003 {
    public static void main(String args[]) {
        Scanner divisao = new Scanner(System.in);

        System.out.println("Informe o número a ser dividido: ");
        int a = divisao.nextInt();

        System.out.println("Informe por quanto ele será dividido: ");
        int b = divisao.nextInt();

        System.out.printf("d% / d% = 3d%", a, b, (a / b));
    }
}