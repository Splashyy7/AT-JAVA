import java.util.Scanner;

public class N8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do gerente: ");
        String nomeGerente = scanner.nextLine();
        System.out.print("Digite o salário base do gerente: ");
        double salarioGerente = scanner.nextDouble();
        double salarioFinalGerente = salarioGerente * 1.2;

        scanner.nextLine();
        System.out.print("Digite o nome do estagiário: ");
        String nomeEstagiario = scanner.nextLine();
        System.out.print("Digite o salário base do estagiário: ");
        double salarioEstagiario = scanner.nextDouble();
        double salarioFinalEstagiario = salarioEstagiario * 0.9;

        System.out.println("Salário final do Gerente " + nomeGerente + ": " + salarioFinalGerente);
        System.out.println("Salário final do Estagiário " + nomeEstagiario + ": " + salarioFinalEstagiario);

    }
}