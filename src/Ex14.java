import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // 14. A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão
        // Aritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),
        // r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmo
        // que encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n =
        // 7, r = 3. Resultado: an = 28
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º termo da sua progressão (a1): ");
        float a1 = scanner.nextFloat();

        System.out.println("Digite qual será o enesimo termo da sua progressão (n): ");
        int n = scanner.nextInt();

        System.out.println("Digite a razao da sua progressão (r): ");
        float r = scanner.nextFloat();

        float an = a1 + (n - 1) * r;

        System.out.println("Resultado: "+an);

        scanner.close();
    }
    
}
