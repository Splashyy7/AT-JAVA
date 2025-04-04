import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário mensal : R$");
        double Mensal = scanner.nextDouble();

        double Anual = Mensal * 12;

        double Imposto = 0;
        double valorImposto = 0;

        if (Anual <= 22847.76) {
            Imposto = 0;
        } else if (Anual <= 33919.80) {
            Imposto = 7.5;
        } else if (Anual <= 45012.60) {
            Imposto = 15;
        } else {
            Imposto = 27.5;
        }

        valorImposto =(Anual * Imposto) / 100;

        double liquidoA = Anual - valorImposto;

        double liquidoM = liquidoA / 12;


        System.out.println("// RESULTADO: //");
        System.out.println("Salário Bruto Mensal: R$ " + Mensal);
        System.out.println("Salário Bruto Anual: R$ " + Anual);

        if (Imposto == 0) {
            System.out.println("Situação: Isento de Imposto de Renda");
            System.out.println("Valor do Imposto Anual: R$ 0,00");
        } else {
            System.out.println("Alíquota aplicada: " + Imposto + "%");
            System.out.println("Valor do Imposto Anual: R$ " + valorImposto);
        }

        System.out.println("Salário Líquido Anual: R$ " + liquidoA);
        System.out.println("Salário Líquido Mensal: R$ " +  liquidoM);
}
}