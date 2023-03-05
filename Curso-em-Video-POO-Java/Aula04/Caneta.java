package Aula04;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // construtor
    public Caneta(String m, String c, float p, boolean t) {
        setModelo(m);
        setCor(c);
        setPonta(p);
        setTampada(t);
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // get
    public String getModelo() {
        // todo metodo get precisa de retorno
        return this.modelo;
    }

    // set
    public void setModelo(String m) {
        this.modelo = m;
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // get
    public String getCor() {
        return this.cor;
    }

    // set
    public void setCor(String c) {
        this.cor = c;
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // get
    public float getPonta() {
        // todo metodo get precisa de retorno
        return this.ponta;
    }

    // set
    public void setPonta(float p) {
        this.ponta = p;
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // get
    public boolean getTampada() {
        return this.tampada = true;
    }

    // set
    public void setTampada(boolean t) {
        this.tampada = t;
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Tampada: " + getTampada());
    }
}
