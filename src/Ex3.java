import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // 3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nas
        // variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar
        // ao usuário que a sequência de números informados é inválida. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º numero: ");
        int A = scanner.nextInt();

        System.out.println("Digite o 2º numero: ");
        int B = scanner.nextInt();

        if (A > B){
            System.out.println(A +" é maior que " +B);
        }else if (A < B){
            System.out.println(A +" é menor que " +B);
        }else{
            System.out.println("Sequência de números informados é inválida.");
        }

        scanner.close();


    }
    
}
