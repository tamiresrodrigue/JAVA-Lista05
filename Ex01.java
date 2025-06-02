package lista05;
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
        } else {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
}
	}
	}