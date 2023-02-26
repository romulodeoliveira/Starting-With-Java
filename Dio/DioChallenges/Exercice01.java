import java.util.Scanner;

public class Exercice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int cc = sc.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String ag = sc.next();

        System.out.print("Por favor, digite o seu nome: ");
        String nome = sc.next();

        System.out.print("Por favor, digite o seu saldo: ");
        Double saldo = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
                nome, ag, cc, saldo);

        sc.close();
    }
}