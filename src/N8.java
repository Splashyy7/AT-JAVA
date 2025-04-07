public class N8 {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Gerente", 2000.0);
        Funcionario estagiario = new Estagiario("Estagiário", 2000.0);

        gerente.exibirSalarioFinal();
        estagiario.exibirSalarioFinal();
    }
}

class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioFinal() {
        return salarioBase;
    }

    public void exibirSalarioFinal() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Final: R$ " + calcularSalarioFinal());
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 1.2;
    }
}

class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 0.9;
    }
}