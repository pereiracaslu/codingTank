/*Escreva um programa que com base em uma temperatura em graus celsius, 
 * realize a conversão e exiba os resultados conforme as fórmulas abaixo:
Kelvin
K = Celsius + 273.15;

Fahrenheit
F = Celsius * 1.8 + 32;

Rankine
Ra = Celsius * 1.8 + 32 + 459.67

Réaumur
Re = Celsius * 0.8;
*/

package exercicios;

public class TemperaturaConversao {

	public static void main(String[] args) {
		
		double celsius = 15;
		
		double k = celsius + 273.15;
				System.out.printf("%.2f",k);
				
		double f = celsius * 1.8 + 32;
				System.out.printf("\n%.2f",f);
				
		//Rankine
				System.out.printf("\n%.2f",f+459.67);
				
		double re = celsius * 0.8;
				System.out.printf("\n%.2f",re);

	}

}
