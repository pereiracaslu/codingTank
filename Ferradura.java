/*Escreva um programa para calcular a quantidade de ferraduras necess�rias para 
 * equipar todos os cavalos comprados para um haras. 
 * A informa��o de cavalos comprados deve ser informada pelo usu�rio.
*/package exercicios;

import java.util.Scanner;

public class Ferradura {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int cavalo, pata =4, ferradura;
		
		System.out.print("Informe o n�mero de cavalos: ");
		cavalo = leia.nextInt();
		ferradura = cavalo*pata;
		
		System.out.println("\nQuantidade de ferraduras necess�rias: "+ferradura);
		leia.close();
	}

}
