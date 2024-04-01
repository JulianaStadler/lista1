import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // 11. Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em
        // ordem crescente. 
        int[] valor = new int[3];
        boolean repita = false;
        int copo;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < valor.length; i++ ){
            System.out.println("Digite o "+(i + 1)+" número");
            valor[i] = scanner.nextInt();
        }

        System.out.println("==========================");

        do{
            repita = false;
            
            for(int i = 0; i < valor.length - 1; i++ ){
                if (valor[i] > valor[i + 1]){
                    copo = valor[i + 1];
                    valor[i + 1] = valor[i];
                    valor[i] = copo;
                    repita = true;
                }
            }
        } while (repita);

        for(int i = 0; i <= valor.length; i++ ){
            System.out.println((i + 1)+" = "+ valor[i]);
        }



        scanner.close();
    }
    
}
