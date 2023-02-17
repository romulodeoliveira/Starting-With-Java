/*
 * Escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercice011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code, quantity;

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Cachorro Quente", 4.00));
        products.add(new Product(2, "X-Salada", 4.50));
        products.add(new Product(3, "X-Bacon", 5.00));
        products.add(new Product(4, "Torrada Simples", 2.00));
        products.add(new Product(5, "Refrigerante", 1.50));

        System.out.println("------------------------------------------------------");
        System.out.printf("%10s %20s %10s%n%n", "CÓDIGO", "ESPECIFICAÇÃO", "PREÇO");
        System.out.println("------------------------------------------------------");

        for (Product product : products) {
            System.out.printf("%10d %20s %10.2f%n",
                    product.getId(),
                    product.getName(),
                    product.getPrice());
        }

        System.out.println();
        System.out.print("DIGITE O ID E A QUANTIDADE DO ITEM: ");
        code = sc.nextInt();
        quantity = sc.nextInt();

        if (code == 1) {
            System.out.printf("O VALOR FINAL É DE: R$ %.2f%n", quantity * 4.00);
        }

        else if (code == 2) {
            System.out.printf("O VALOR FINAL É DE: R$ %.2f%n", quantity * 4.50);
        }

        else if (code == 3) {
            System.out.printf("O VALOR FINAL É DE: R$ %.2f%n", quantity * 5.00);
        }

        else if (code == 4) {
            System.out.printf("O VALOR FINAL É DE: R$ %.2f%n", quantity * 2.00);
        }

        else if (code == 5) {
            System.out.printf("O VALOR FINAL É DE: R$ %.2f%n", quantity * 1.50);
        }

        else {
            System.out.println("Ops... Parece que você digitou algo errado. Tente novamente!");
        }

        sc.close();
    }
}

class Product {
    private int id;
    private String name;
    private Double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}