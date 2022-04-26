package App;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculo IMC:");
		System.out.println("Digite seu peso:");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite sua altura:");
		double altura =  entrada.nextDouble();
		
		double resultado = peso / (altura * altura);
		
		System.out.printf("Seu IMC: %.2f ",  resultado);
		
		entrada.close();

	}

}
