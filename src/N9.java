class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}

public class N9 {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("João Pedro");
        conta.depositar(500.0);
        conta.exibirSaldo();
        conta.sacar(200.0);
        conta.exibirSaldo();
        conta.sacar(400.0);
    }
}