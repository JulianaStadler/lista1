import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        // 9. Leia dois números nas variáveis A e B e identifique se os valores são iguais ou
        // diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.
        // Caso sejam diferentes, informe que são diferentes e qual número é o maior. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º numero: ");
        int A = scanner.nextInt();

        System.out.println("Digite o 2º numero: ");
        int B = scanner.nextInt();

        if (A == B){
            System.out.println("Numeros iguais");
        }else{
            System.out.println("Numeros diferentes");
            if (A > B){
                System.out.println(A +" é maior que " +B);
            }else{
                System.out.println(B +" é maior que " +A);
            }
        }

        scanner.close();
    }
    
}
