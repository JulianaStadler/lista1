import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        // 18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média
        // harmônica.
        // Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8
        // Média: 7.37
        Scanner scanner = new Scanner(System.in);
        float[] nota = new float[3];
        float mediaC = 0;

        for(int i = 0; i < nota.length; i++){
            System.out.println("Digite a "+(i + 1)+"ª nota: ");
            nota[i] = scanner.nextFloat();

            mediaC = mediaC + (1 / nota[i]);
        }
        
        System.out.println("A media harmonica é "+(nota.length / mediaC));

        scanner.close();
    }
    
}
