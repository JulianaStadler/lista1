import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        // 19. Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu
        // volume calculado de acordo com a seguinte fórmula: volume = 3.14 * raio^2 * altura;
        // Exemplo: raio = 10, altura = 15. Volume = 4710
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a raio: ");
        float raio = scanner.nextFloat();

        System.out.println("Digite a altura: ");
        float altura = scanner.nextFloat();

        System.out.println("O volume do cilindro é: "+ (3.14 * Math.pow(raio, 2) * altura));

        scanner.close();
    }
    
}
