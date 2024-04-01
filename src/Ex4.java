import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // 4. Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,
        // multiplicação e a divisão dos números lidos. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o 2º numero: ");
        int n2 = scanner.nextInt();

        System.out.println("Soma: "+n1+" + "+n2+" = "+(n2+n1));
        System.out.println("Subtração: "+n1+" - "+n2+" = "+(n2-n1));
        System.out.println("Multiplicação: "+n1+" * "+n2+" = "+(n2*n1));
        System.out.println("Divisão: "+n1+" / "+n2+" = "+(n2/n1));

        scanner.close();

    }
}
