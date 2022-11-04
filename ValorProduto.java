/*Faça um programa que receba o preço de custo do produto e exiba o valor de venda.
 * O valor de venda receberá um acréscimo de acordo com o percentual informado pelo usuário.*/
package exercicios;

import java.util.Scanner;

public class ValorProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double custoProd, valorVenda=0, percentual;

		System.out.print("Preço de custo R$ ");
		custoProd = leia.nextDouble();
		
		System.out.printf("\nPercentual de lucro: ");
		percentual = leia.nextDouble();
		
		valorVenda = percentual/100 * custoProd + custoProd;
		
		System.out.printf("\n\nCusto do produto R$ %.2f",valorVenda);
		
		leia.close();
		
	}

}
