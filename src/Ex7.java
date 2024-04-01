import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // 7. Escreva um algoritmo que leia um número e diga, através de uma mensagem, se
        // este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo
        // o usuário também deverá ser informado. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número entre 100 e 200: ");
        int n1 = scanner.nextInt();

        if((n1 > 100) && (n1 < 200)){
            System.out.println("Número dentro do intervalo");
        }else{
            System.out.println("Número fora do intervalo");
        }

        scanner.close();
    }
    
}
