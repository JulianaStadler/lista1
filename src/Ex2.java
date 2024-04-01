import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o
        // resultado da sua soma. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o 2º numero: ");
        int n2 = scanner.nextInt();

        System.out.println(n1+" + "+n2+" = "+(n2+n1));

        scanner.close();

    }
    
}
