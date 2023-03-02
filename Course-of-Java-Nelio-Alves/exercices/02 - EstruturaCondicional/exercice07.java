/*
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
 */

import java.util.Scanner;

public class exercice07 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.printf("%30s %20s%n", "Renda", "Imposto de Renda");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%30s %20s%n", "De 0.00 a R$ 2000.00", "Isento");
        System.out.printf("%30s %20s%n", "De 2000.01 a R$ 3000.00", "8%");
        System.out.printf("%30s %20s%n", "De 3000.01 até R$ 4500.00", "18%");
        System.out.printf("%30s %20s%n%n", "Acima de R$ 4500.00", "28%");

        Scanner sc = new Scanner(System.in);
        double salary;

        System.out.print("Diga quanto você ganha: R$ ");
        salary = sc.nextDouble();

        // De 0.00 a R$ 2000.00
        if (salary >= 0 && salary <= 2000) {
            System.out.println("Infelizmente você não paga imposto! :(");
        }

        // De 2000.01 a R$ 3000.00
        else if (salary >= 2000.01 && salary <= 3000) {
            System.out.printf("Você pagará R$ %.2f de imposto! Uhull! XD%n",
                    8 * (salary - 2000) / 100);
        }

        // De 3000.01 até R$ 4500.00
        else if (salary >= 3000.01 && salary <= 4500) {
            System.out.printf("Você pagará R$ %.2f de imposto! Uhull! XD%n",
                    18 * (salary - 3000) / 100 + (8 * 1000 / 100));
        }

        // Acima de R$ 4500.00
        else if (salary > 4500) {
            System.out.printf("Você pagará R$ %.2f de imposto! Uhull! XD%n",
                    28 * (salary - 4500) / 100 + (18 * 1500 / 100 + (8 * 1000 / 100)));
        }

        else {
            System.out.println("Ops... Acho que você digitou algo errado. Tente novamente!");
        }

        sc.close();
    }
}
