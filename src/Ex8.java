import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 8. Escreva um algoritmo que leia um número e mostre uma mensagem caso este
        // número seja maior ou igual a 50, outra se ele for menor que 50. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número entre 100 e 200: ");
        int n1 = scanner.nextInt();

        if(n1 >= 50){
            System.out.println("Número maior ou igual a 50");
        }else{
            System.out.println("Número menor que 50");
        }

        scanner.close();
    }
    
}
