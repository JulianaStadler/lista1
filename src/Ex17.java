import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        // 17. Elabore um algoritmo que receba três notas de um aluno os pesos referentes a
        // cada nota e retorne a sua média ponderada.
        Scanner scanner = new Scanner(System.in);
        float[] nota = new float[3];
        float[] peso = new float[nota.length];
        float mediaC = 0;
        float mediaB = 0;

        for(int i = 0; i < nota.length; i++){
            System.out.println("Digite a "+(i + 1)+"ª nota: ");
            nota[i] = scanner.nextFloat();

            System.out.println("Digite o peso da "+(i + 1)+"ª nota: ");
            peso[i] = scanner.nextFloat();

            mediaC = mediaC + (nota[i] * peso[i]);
            mediaB = mediaB + peso[i];
        }
        
        System.out.println("A media é "+(mediaC / mediaB));

        scanner.close();
        
    }
}
