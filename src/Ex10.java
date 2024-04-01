import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // 10. Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso
        // o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número
        // inválido!”.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 5: ");
        int n1 = scanner.nextInt();

        switch (n1) {
            case 1:
                System.out.println(n1+" - Um");
                break;
            case 2:
                System.out.println(n1+" - Dois");
                break;
            case 3:
                System.out.println(n1+" - Três");
                break;
            case 4:
                System.out.println(n1+" - Quatro");
                break;
            case 5:
                System.out.println(n1+" - Cinco");
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }


        scanner.close();
    }
    
}
