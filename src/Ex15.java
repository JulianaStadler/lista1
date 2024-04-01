import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        // 15. Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2, y2), 
        // calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é: 
        // d = raiz (((x2 - x1)^2) + ((y2 - y1)^2 )). 
        // Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ponto 1, posicão a: ");
        double x1 = scanner.nextDouble();
        System.out.println("Ponto 1, posicão b: ");
        double y1 = scanner.nextDouble();
        System.out.println("Ponto 2, posicão a: ");
        double x2 = scanner.nextDouble();
        System.out.println("Ponto 2, posicão b: ");
        double y2 = scanner.nextDouble();

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.printf("Distancia: %.2f%n", d);

        scanner.close();
    }
    
}
