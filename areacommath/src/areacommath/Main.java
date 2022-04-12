package areacommath;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int raio;
		float area;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o valor do raio:");
		raio = scanner.nextInt();
		
		// area = pi*r2		
		area = (float) (Math.PI * Math.pow(raio, 2));
		
		System.out.println("Área é: " + area); 
	}

}
