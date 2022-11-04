/*Escreva um programa para ler o raio de um círculo, calcular e escrever o valor da área:
Cálculo:  área = PI * (raio²)*/
package exercicios;

import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		final double PI = 3.14159, raio, area;
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Valor do raio: ");
		raio = leia.nextDouble();
		area = PI * Math.pow(raio, 2);
		
		System.out.printf("\nÁrea da circunferência: %.2f", area);
		
		leia.close();
		
		

	}

}
