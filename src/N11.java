import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class N11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sorteio = new int[6];
        for (int i = 0; i < 6; i++) {
            sorteio[i] = random.nextInt(60) + 1;
        }

        Scanner scanner = new Scanner(System.in);
        int[] numeroescolhido = new int[6];
        System.out.println("Digite 6 números entre 1 e 60:");
        for (int i = 0; i < 6; i++) {
            numeroescolhido[i] = scanner.nextInt();
        }

        int acertos = 0;
        for (int numeroUsuario : numeroescolhido) {
            for (int numeroSorteado : sorteio) {
                if (numeroUsuario == numeroSorteado) {
                    acertos++;
                }
            }
        }
        System.out.println("Números sorteados: " + Arrays.toString(sorteio));
        System.out.println("Seus números: " + Arrays.toString(numeroescolhido));
        System.out.println("Você acertou " + acertos + " números");
    }
}