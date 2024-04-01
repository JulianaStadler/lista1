import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // 5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor
        // da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o
        // valor da variável A. Apresentar uma mensagem com o valor original de cada variável
        // e outra com os valores trocados. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º numero: ");
        int A = scanner.nextInt();

        System.out.println("Digite o 2º numero: ");
        int B = scanner.nextInt();

        System.out.println("A = " + A);
        System.out.println("B = " + B);

        int COPO = A;
        A = B;
        B = COPO;
        
        System.out.println("TROCADOS");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        scanner.close();
    }
    
}
