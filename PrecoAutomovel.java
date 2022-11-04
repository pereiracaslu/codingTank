/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a 
 porcentagem do distribuidor e dos impostos.
Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%. 
Escreva um programa que leia o custo de f�brica e informe o custo ao consumidor final.*/

package exercicios;

import java.util.Scanner;

public class PrecoAutomovel {

	public static void main(String[] args) {
		double custoFinal, custoFabrica, distribuidor=0.28, imposto=0.45;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Custo de f�brica R$ ");
		custoFabrica = leia.nextDouble();
		
		custoFinal = custoFabrica + custoFabrica*distribuidor + custoFabrica*imposto;
		
		System.out.printf("\nCusto ao consumidor R$ %.2f",custoFinal);
		
		leia.close();
	}

}
