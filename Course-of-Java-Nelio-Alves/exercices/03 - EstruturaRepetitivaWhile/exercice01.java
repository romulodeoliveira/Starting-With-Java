/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja
 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
 * correta é o valor 2002.
 */

import java.util.Scanner;

public class exercice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 2002;
        int question = 0;

        while (question != password) {
            System.out.print("Digite sua senha: ");
            question = sc.nextInt();

            if (question != password) {
                System.out.println("Senha inválida!");
            }
        }

        System.out.println("Senha correta.");
        sc.close();
    }
}