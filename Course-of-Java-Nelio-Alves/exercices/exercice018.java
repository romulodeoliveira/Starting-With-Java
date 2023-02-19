/*
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo. 
 */

import java.util.Scanner;

public class exercice018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int question = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.printf("Você abastece com:%n1. Alcool%n2. Gasolina%n3. Diesel%n4. Fim%n%n");

        while (question != 4) {
            System.out.print("Sua resposta: ");
            question = sc.nextInt();

            if (question == 1) {
                a += 1;
            }

            else if (question == 2) {
                b += 1;
            }

            else if (question == 3) {
                c += 1;
            }
        }

        System.out.printf("%nMUITO OBRIGADO!%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", a, b, c);

        sc.close();
    }
}
