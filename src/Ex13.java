import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // 13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de
        // operador em outra variável do tipo CARACTERE. Imprima o resultado da operação
        // de A por B se o operador aritmético for válido; caso contrário deve ser impresso uma
        // mensagem de operador não definido. Tratar erro de divisão por zero
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º numero: ");
        float A = scanner.nextFloat();

        System.out.println("Digite o 2º numero: ");
        float B = scanner.nextFloat();

        System.out.println("Digite o simbolo da operação (+, -, /, *): ");
        String simbolo = scanner.next();

        switch (simbolo) {
            case "+":
                System.out.println("Soma: "+A+" + "+B+" = "+(B+A));
                break;
            case "-":
                System.out.println("Subtração: "+A+" - "+B+" = "+(B-A));
                break;
            case "*":
                System.out.println("Multiplicação: "+A+" * "+B+" = "+(B*A));
                break;
            case "/":
                if((A == 0)||(B == 0)){
                    System.out.println("Erro! Divisão por 0.");
                } else {
                    System.out.println("Divisão: "+A+" / "+B+" = "+(B/A));
                }
                break;
            default:
                System.out.println("Operador invalido.");
                break;
        }

        scanner.close();
    }
}
