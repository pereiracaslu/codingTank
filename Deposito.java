/*Crie um programa que receba um valor que foi depositado e logo em seguida o valor
  com rendimento ap�s 1 m�s.
 * Considere a taxa de juros da poupan�a em 0,70% a.m.*/
package exercicios;

import java.util.Scanner;

public class Deposito {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double deposito, saldoFuturo=0;
		
		System.out.print("Digite o valor a ser depositado R$ ");
		deposito = leia.nextDouble();
		
		saldoFuturo = 0.007*deposito+deposito;
		
		System.out.println("Rendimento ap�s um m�s R$ "+saldoFuturo);
		
		leia.close();

	}

}
