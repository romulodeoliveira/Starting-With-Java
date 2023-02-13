/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

import java.util.Scanner;

public class exercice005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDoFuncionario, horasTrabalhadas;
        double salario;

        System.out.print("Digite o número do funcionário: ");
        numeroDoFuncionario = sc.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor que este funcionário recebe por horas trabalhadas: ");
        salario = sc.nextDouble();

        System.out.printf("O colaborador com a matrícula %d terá o salário de R$ %.2f%n",
                numeroDoFuncionario,
                horasTrabalhadas * salario);

        sc.close();
    }
}
