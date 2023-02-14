/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

import java.util.Scanner;

public class exercice006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigoPecaUm, quantidadeDePecasUm, codigoPecaDois, quantidadeDePecasDois;
        double valorPecaUm, valorPecaDois;

        System.out.print(
                "Digite o código da peça, depois a quantidade de peças e, por ultimo, o valor unitário da peça: ");
        codigoPecaUm = sc.nextInt();
        quantidadeDePecasUm = sc.nextInt();
        valorPecaUm = sc.nextDouble();

        System.out.print(
                "Digite o código da peça, depois a quantidade de peças e, por ultimo, o valor unitário da peça: ");
        codigoPecaDois = sc.nextInt();
        quantidadeDePecasDois = sc.nextInt();
        valorPecaDois = sc.nextDouble();

        System.out.printf("%nValor a pagar: %.2f%n",
                quantidadeDePecasUm * valorPecaUm + quantidadeDePecasDois * valorPecaDois);

        sc.close();
    }
}
