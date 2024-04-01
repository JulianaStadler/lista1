import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        // 16. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média
        // aritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        float n1 = scanner.nextFloat();
        System.out.println("Digite a nota 2: ");
        float n2 = scanner.nextFloat();
        System.out.println("Digite a nota 3: ");
        float n3 = scanner.nextFloat();

        System.out.println("Media: "+((n1 + n2 + n3)/3));

        scanner.close();
    }
}
