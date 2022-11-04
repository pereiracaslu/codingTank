/* Crie um programa que com base em um salário de um funcionário, 
 * reajusta o salário em 7% e mostra o valor antes do reajuste e após.*/

package exercicios;


import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		
		double salario, salarioNovo;
		Scanner leia = new Scanner(System.in);
				
		System.out.print("Entre com o salário: ");
		salario = leia.nextDouble();
		
		salarioNovo=salario*0.07+salario;
		
		
		System.out.printf("\nNovo salário: %.2f", salarioNovo);
		System.out.println("\nSalário anterior: "+salario);
		
		leia.close();

	}

}
