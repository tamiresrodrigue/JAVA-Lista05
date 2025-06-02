package lista05;
import java.util.Scanner;
public class Ex02 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita os comprimentos dos lados
	        System.out.print("Digite o comprimento do lado 1: ");
	        double a = scanner.nextDouble();

	        System.out.print("Digite o comprimento do lado 2: ");
	        double b = scanner.nextDouble();

	        System.out.print("Digite o comprimento do lado 3: ");
	        double c = scanner.nextDouble();

	        // Verifica se forma um triângulo válido
	        if (a + b > c && a + c > b && b + c > a) {
	            // Classifica o triângulo
	            if (a == b && b == c) {
	                System.out.println("O triângulo é Equilátero.");
	            } else if (a == b || b == c || a == c) {
	                System.out.println("O triângulo é Isósceles.");
	            } else {
	                System.out.println("O triângulo é Escaleno.");
	            }
	        } else {
	            System.out.println("Os lados não formam um triângulo válido.");
	        }

	        scanner.close();
	    }
	}

