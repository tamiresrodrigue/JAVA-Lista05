package lista05;
import java.util.Scanner;
public class Ex03 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite seu peso em kg: ");
	        double peso = scanner.nextDouble();

	        System.out.print("Digite sua altura em metros (ex: 1.75): ");
	        double altura = scanner.nextDouble();

	        double imc = peso / (altura * altura);
	        System.out.printf("Seu IMC é: %.2f\n", imc);
	        if (imc < 18.5) {
	            System.out.println("Classificação: Abaixo do peso");
	        } else if (imc < 25) {
	            System.out.println("Classificação: Peso normal");
	        } else if (imc < 30) {
	            System.out.println("Classificação: Sobrepeso");
	        } else if (imc < 35) {
	            System.out.println("Classificação: Obesidade grau I");
	        } else if (imc < 40) {
	            System.out.println("Classificação: Obesidade grau II");
	        } else {
	            System.out.println("Classificação: Obesidade grau III");
	        }

	        scanner.close();
	    }
}
