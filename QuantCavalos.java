/*Escreva um programa para determinar a quantidade de cavalos para se levantar uma massa de
 “m” quilogramas a uma altura de “h” em “t” segundos. 
 Considere cavalos = (m * h / t ) / 745,6999*/
package exercicios;

import java.util.Scanner;

public class QuantCavalos {
	
public static void main(String[] args) {
	double m, h, t, quantCavalo;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite altura: ");
	h = leia.nextDouble();
	
	System.out.print("Digite peso: ");
	m = leia.nextDouble();
	
	System.out.print("Quantos segundos: ");
	t = leia.nextDouble();
	
	
	quantCavalo = (h*m*t)/745.6999;
	
	leia.close();
	
	System.out.printf("Quantidade de cavalos necessária: %.1f",quantCavalo);
	
	
	
}

}
