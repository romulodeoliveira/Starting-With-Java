package Aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private boolean status;

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    public void estadoAtual() {
        System.out.println("-------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("-------------------------------------------");

    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    public void abrirConta() {
        this.setTipo(tipo);
        this.setStatus(true);
        if (this.getTipo() == "CC") {
            this.setSaldo(50.00);
            System.out.println("Conta aberta com sucesso.");

        }

        else if (this.getTipo() == "CP") {
            this.setSaldo(150.00);
            System.out.println("Conta aberta com sucesso.");
        }

        else {
            System.out.println("Erro no tipo da conta.");
        }
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro.");
        }

        else if (this.getSaldo() < 0) {
            System.out.println("Conta com dívidas em aberto.");
        }

        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    public void depositar(double v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }

        else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    public void sacar(double v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }

            else {
                System.out.println("Saldo insuficiente.");
            }
        }

        else {
            System.out.println("Impossivel sacar fechada.");
        }
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // pagarMensal

    public void pagarMensal() {
        double v = 0.0;

        if (this.getTipo() == "CC") {
            v = 12;
        }

        else if (this.getTipo() == "CP") {
            v = 20;
        }

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }

        else {
            System.out.println("Impossivel pagar por uma conta fechada.");
        }
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // CONSTRUCTOR
    public ContaBanco() {
        saldo = 0.0;
        status = false;
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // SET
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    // GET
    public int getNumConta() {
        return this.numConta;
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // SET
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // GET
    public String getTipo() {
        return this.tipo;
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // SET
    public void setDono(String dono) {
        this.dono = dono;
    }

    // GET
    public String getDono() {
        return this.dono;
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // SET
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // GET
    public Double getSaldo() {
        return this.saldo;
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // SET
    public void setStatus(boolean status) {
        this.status = status;
    }

    // GET
    public boolean getStatus() {
        return this.status;
    }

}
