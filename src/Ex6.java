import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
        // Fahrenheit. A fórmula de conversão é:
        // F = (9 * C + 160) / 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite graus celcius: ");
        float C = scanner.nextFloat();

        System.out.println(C+ " graus celcius é igual a "+ ((9 * C + 160) / 5) +" graus Fahrenheit");

        scanner.close();
    }
}