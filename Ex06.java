package lista05;
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }

        if (numero > 0) {
            System.out.println(numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        scanner.close();
    }
}
