import java.util.Scanner;

class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;
    double nota3;

    double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println("Aprovado, Média: " + media);
        } else {
            System.out.println("Reprovado, Média: " + media);
        }
    }
}

public class N7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        aluno.matricula = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        aluno.nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        aluno.nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        aluno.nota3 = scanner.nextDouble();

        System.out.println("Situação do aluno:");
        aluno.verificarAprovacao();
    }
}