/*Escreva um programa em java para definir o consumo médio de um automóvel sendo fornecido a 
 * distância total percorrida pelo automóvel e o total de combustível gasto (litros).*/
package exercicios;

import java.util.Scanner;

public class ConsumoAutomovel {

	public static void main(String[] args) {
		double preco=0, gasolina, diesel, etanol, dist, consumo, kmL=0;
		int op;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Trajeto percorrido: ");
		dist = leia.nextDouble();
		
		System.out.print("Combustivel consumido: ");
		consumo = leia.nextDouble();
		
		kmL= dist/consumo;
		
		do {

		System.out.print("\nCombustivel utilizado: \n1 - Gasolina\n2 - Etanol\n3 - Diesel\nDigite: ");
		op = leia.nextInt();
		
		if(op<1 || op>3){
			System.out.println("Número invalido. Tente novamente!!!");
		}
		//gasolina
		if (op==1) {
			gasolina = 5.30;
			preco = consumo*gasolina;
		}
		//etanol
		if (op==2) {
			etanol = 3.90;
			preco = consumo*etanol;
		}
		//diesel
		if (op==3) {
			diesel = 6.70;
			preco = consumo*diesel;
		}
		
		}while (op<1 || op>3);
		
		kmL= dist/consumo;
		
		System.out.printf("\nConsumo médio: %.1f",kmL);
		System.out.println(" Km/L");
		System.out.printf("Gasto médio: R$ %.2f", preco);
		
		leia.close();
	}

}
