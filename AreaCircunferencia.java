/*Escreva um programa para ler o raio de um c�rculo, calcular e escrever o valor da �rea:
C�lculo:  �rea = PI * (raio�)*/
package exercicios;

import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		final double PI = 3.14159, raio, area;
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Valor do raio: ");
		raio = leia.nextDouble();
		area = PI * Math.pow(raio, 2);
		
		System.out.printf("\n�rea da circunfer�ncia: %.2f", area);
		
		leia.close();
		
		

	}

}
