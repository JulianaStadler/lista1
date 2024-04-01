import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre a
        // mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número
        // menor ou igual a 10!”, caso este número seja menor ou igual. 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if (numero > 10){
            System.out.println(numero +" é maior que 10");
        }else if (numero < 10){
            System.out.println(numero +" é menor que 10");
        }else{
            System.out.println(numero +" é igual a 10");
        }
        
        scanner.close();
    }
    
}
