/*Crie um programa que receba 2 números e ao final mostre as seguintes operações:
Soma
Subtração
Multiplicação
Divisã
 */

package exercicios;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		 double x, y;
		 
		 System.out.print("Entre com um 1° número: ");
		 x = leia.nextDouble();
		 
		 System.out.print("\nEntre com um 2° número: ");
		 y = leia.nextDouble();
		 
		 System.out.println(x+y);
		 System.out.println(x-y);
		 System.out.println(x*y);
		 System.out.printf("%.2f",x/y);
		 
		 leia.close();		

	}

}
