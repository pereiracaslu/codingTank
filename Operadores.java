/*Crie um programa que receba 2 n�meros e ao final mostre as seguintes opera��es:
Soma
Subtra��o
Multiplica��o
Divis�
 */

package exercicios;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		 double x, y;
		 
		 System.out.print("Entre com um 1� n�mero: ");
		 x = leia.nextDouble();
		 
		 System.out.print("\nEntre com um 2� n�mero: ");
		 y = leia.nextDouble();
		 
		 System.out.println(x+y);
		 System.out.println(x-y);
		 System.out.println(x*y);
		 System.out.printf("%.2f",x/y);
		 
		 leia.close();		

	}

}
