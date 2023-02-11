
/*
 * Write a Java program to print the sum of two numbers.
 * 
 * Test Data:
 * 74 + 36
 * Expected Output :
 * 110
 */
import java.util.Scanner; // Aqui importo a classe scanner aqui

public class exercice002 {
    public static void main(String args[]) {
        Scanner sum = new Scanner(System.in); // Aqui instancio e crio um objeto Scanner

        System.out.println("Informe o primeiro valor: ");
        int a = sum.nextInt();

        System.out.print("Informe o segundo valor: ");
        int b = sum.nextInt();

        System.out.printf("%d + %d = %d", a, b, (a + b));
    }
}