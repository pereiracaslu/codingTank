/*Fa�a um programa que receba o pre�o de custo do produto e exiba o valor de venda.
 * O valor de venda receber� um acr�scimo de acordo com o percentual informado pelo usu�rio.*/
package exercicios;

import java.util.Scanner;

public class ValorProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double custoProd, valorVenda=0, percentual;

		System.out.print("Pre�o de custo R$ ");
		custoProd = leia.nextDouble();
		
		System.out.printf("\nPercentual de lucro: ");
		percentual = leia.nextDouble();
		
		valorVenda = percentual/100 * custoProd + custoProd;
		
		System.out.printf("\n\nCusto do produto R$ %.2f",valorVenda);
		
		leia.close();
		
	}

}
