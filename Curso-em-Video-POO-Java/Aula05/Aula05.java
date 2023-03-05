package Aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta();
        c1.depositar(10);

        c1.setNumConta(1);
        c1.setDono("Romulo");
        c1.setTipo("CC");

        c1.estadoAtual();
    }
}
