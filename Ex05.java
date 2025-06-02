package lista05;
import java.util.Scanner;
public class Ex05 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita as três notas
	        System.out.print("Digite a nota 1: ");
	        double n1 = scanner.nextDouble();

	        System.out.print("Digite a nota 2: ");
	        double n2 = scanner.nextDouble();

	        System.out.print("Digite a nota 3: ");
	        double n3 = scanner.nextDouble();

	        // Calcula a média simples
	        double media = (n1 + n2 + n3) / 3;

	        System.out.printf("Média: %.2f\n", media);

	        // Classifica com base na média
	        if (media >= 70) {
	            System.out.println("Classificação: Aprovado");
	        } else if (media >= 50) {
	            System.out.println("Classificação: Recuperação");
	        } else {
	            System.out.println("Classificação: Reprovado");
	        }

	        scanner.close();
	    }
}
