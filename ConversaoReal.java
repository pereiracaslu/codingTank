/*Crie um algoritmo que realize a conversão do valor em real para as seguintes moedas:
Dólar
Euro
Libra */
package exercicios;

import java.util.Scanner;

public class ConversaoReal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int op;
		double valor, divisor=0;
		do {
		System.out.print("\t\tConversão do Real\n\nDigite o número respectivo para a conversão da moeda desejada\n"
				+ "1 - Dolár\n2 - Euro\n3 - Libra\nDigite: ");
		op = leia.nextInt();
		
		
		if(op ==1) {
			divisor = 5.04;
		}
		if(op ==2) {
			divisor = 5.01;
		}
		if(op ==3) {
			divisor = 5.71;
		}
		}while (op <1 || op >3);		
		System.out.print("\nQuantos reais gostaria de converter R$ ");
		valor = leia.nextDouble();
		
		System.out.printf("Conversão: %.2f",valor/divisor);
		
		leia.close();
		
		
	}

}
