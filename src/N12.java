import java.util.Scanner;

public class N12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        String[] mensagens = new String[10];

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(usuario1 + ", digite sua mensagem: ");
                mensagens[i] = usuario1 + ": " + scanner.nextLine();
            } else {
                System.out.print(usuario2 + ", digite sua mensagem: ");
                mensagens[i] = usuario2 + ": " + scanner.nextLine();
            }
        }
        System.out.println("===== Histórico de Mensagens =====");
        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }
        System.out.println("Obrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");
    }
}