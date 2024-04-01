import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // 12. Escreva um algoritmo que receba o número do mês e mostre o mês
        // correspondente. Valide mês inválido.
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int n1;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite o número de um mês para saber seu nome: ");
            n1 = scanner.nextInt();
            
            if (n1 < 1 || n1 > 12) {
                System.out.println("Entrada inválida. Por favor, digite novamente.");
            }
        } while (n1 < 1 || n1 > 12);

        System.out.println(n1 + " é o mês de "+ meses[n1 - 1]);


        scanner.close();
    }
    
}
