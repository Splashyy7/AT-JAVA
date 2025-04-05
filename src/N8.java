public class N8 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.nome = "Gerente";
        gerente.salarioBase = 1000;

        Estagiario estagiario = new Estagiario();
        estagiario.nome = "Estagiario";
        estagiario.salarioBase = 1000;

        System.out.println("Salário do Gerente " + gerente.nome + ": R$ " + gerente.calcularSalario());
        System.out.println("Salário do Estagiário " + estagiario.nome + ": R$ " + estagiario.calcularSalario());
    }
}

class Funcionario {
    String nome;
    double salarioBase;

    public double calcularSalario() {
        return salarioBase;
    }
}

 class Gerente extends Funcionario {
    public double calcularSalario() {
        return salarioBase * 1.20;
    }
}

class Estagiario extends Funcionario {

    public double calcularSalario() {
        return salarioBase * 0.90;
    }}