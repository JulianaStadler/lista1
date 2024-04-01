import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        // 20. Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em
        // uma viagem, utilizando um automóvel que faz 12km por litro e considerando que são
        // fornecidos o tempo em hora e a velocidade média da viagem.
        Scanner scanner = new Scanner(System.in);
        float automovel = 12;

        System.out.println("Digite o tempo da viagem (em horas): ");
        float tempo = scanner.nextFloat();
        
        System.out.println("Digite a velocidade media da viagem: ");
        float velocidade = scanner.nextFloat();

        System.out.println("A quantidade de litros gasta é de: "+ ((tempo * velocidade) / automovel));

        scanner.close();

    }
    
}
