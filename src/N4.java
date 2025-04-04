import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do empréstimo: R$ ");
        double valorEmprestimo = scanner.nextDouble();

        int numParcelas = 0;
        boolean parcelasValidas = false;

        while (!parcelasValidas) {
            System.out.print("Em quantas parcelas deseja pagar (mínimo 6, máximo 48): ");
            numParcelas = scanner.nextInt();

            if (numParcelas >= 6 && numParcelas <= 48) {
                parcelasValidas = true;
            } else {
                System.out.println("Número de parcelas inválido. Por favor, escolha entre 6 e 48 parcelas.");
            }
        }

        double taxaJurosMensal = 0.03;

        double valorTotal = valorEmprestimo * Math.pow((1 + taxaJurosMensal), numParcelas);

        double valorParcela = valorTotal / numParcelas;

        System.out.println("//// RESULTADO: ////");
        System.out.println("Valor do empréstimo: R$ " + valorEmprestimo);
        System.out.println("Número de parcelas: " + numParcelas);
        System.out.println("Taxa de juros mensal: 3%");
        System.out.println("Valor total a ser pago: R$ " + valorTotal);
        System.out.println ("Valor da parcela mensal: R$ " + valorParcela);
    }
}