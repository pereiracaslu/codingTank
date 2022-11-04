/*Escreva um programa para calcular a quantidade de ferraduras necessárias para 
 * equipar todos os cavalos comprados para um haras. 
 * A informação de cavalos comprados deve ser informada pelo usuário.
*/package exercicios;

import java.util.Scanner;

public class Ferradura {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int cavalo, pata =4, ferradura;
		
		System.out.print("Informe o número de cavalos: ");
		cavalo = leia.nextInt();
		ferradura = cavalo*pata;
		
		System.out.println("\nQuantidade de ferraduras necessárias: "+ferradura);
		leia.close();
	}

}
