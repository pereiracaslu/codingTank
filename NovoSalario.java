/* Crie um programa que com base em um sal�rio de um funcion�rio, 
 * reajusta o sal�rio em 7% e mostra o valor antes do reajuste e ap�s.*/

package exercicios;


import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		
		double salario, salarioNovo;
		Scanner leia = new Scanner(System.in);
				
		System.out.print("Entre com o sal�rio: ");
		salario = leia.nextDouble();
		
		salarioNovo=salario*0.07+salario;
		
		
		System.out.printf("\nNovo sal�rio: %.2f", salarioNovo);
		System.out.println("\nSal�rio anterior: "+salario);
		
		leia.close();

	}

}
