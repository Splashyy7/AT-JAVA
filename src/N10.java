import java.io.*;
import java.util.Scanner;

public class N10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("compras.txt");

            for (int i = 1; i <= 3; i++) {
                System.out.println("Cadastro da Compra " + i);
                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                System.out.print("Preço Unitário: ");
                double preco = Double.parseDouble(scanner.nextLine());

                writer.write("Produto: " + produto + ", Quantidade: " + quantidade + ", Preço Unitário: " + preco);
            }
            writer.close();
            System.out.println("As compras foram salvas no arquivo compras.txt.");

            System.out.println("Compras Registradas:");
            BufferedReader reader = new BufferedReader(new FileReader("compras.txt"));
            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao manipular o arquivo.");
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida para quantidade ou preço.");
        }
    }
}