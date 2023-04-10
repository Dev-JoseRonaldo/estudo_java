package POO.atividadePoo;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        double taxa = 5.00;
        this.saldo -= (valor + taxa);
    }

    public void obterDados() {
        System.out.println("Dados da conta:");
        System.out.printf("Conta: %d%nTitular: %s%nSaldo: $ %.2f%n", this.getNumero(), this.getTitular(), this.getSaldo());
        System.out.println("------------------------------------------");
    }

    public String toString() {
        return "Dados da conta:\n" +
                "Conta: " + this.getNumero() +
                "\nTitular: " + this.getTitular() +
                "\nSaldo: $ " + String.format("%.2f", this.getSaldo())+
                "\n--------------------------------------------";
    }
}
