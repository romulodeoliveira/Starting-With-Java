package Aula02;

public class Caneta {

    // atributo
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // metodo
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);

        if (tampada == true) {
            System.out.println("Tampada");
        }

        else {
            System.out.println("Destampada");
        }
    }

    // metodo
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO!! Não posso rabiscar. Caneta tampada.");
        }

        else {
            System.out.println("Estou rabiscando.");
        }
    }

    // metodo
    void tampar() {
        this.tampada = true;
    }

    // metodo
    void destampar() {
        this.tampada = false;
    }
}
