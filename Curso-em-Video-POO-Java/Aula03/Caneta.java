package Aula03;

public class Caneta {

    /**
     * O "+" significa Public
     * O "-" significa Private
     * O "#" significa Protected
     * 
     * UML - Diagrama de Classes
     */

    // atributo
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    // metodo
    public void status() {
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

    public void escrever() {
        if (this.tampada == true) {
            System.out.println("ERRO!! Não posso escrever. Caneta tampada.");
        }

        else {
            System.out.println("Estou escrevendo.");
        }
    }

    // metodo
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO!! Não posso rabiscar. Caneta tampada.");
        }

        else {
            System.out.println("Estou rabiscando.");
        }
    }

    public void pintar() {
        if (this.tampada == true) {
            System.out.println("ERRO!! Não posso pintar. Caneta tampada.");
        }

        else {
            System.out.println("Estou pintando.");
        }
    }

    // metodo
    private void tampar() {
        this.tampada = true;
    }

    // metodo
    private void destampar() {
        this.tampada = false;
    }
}
