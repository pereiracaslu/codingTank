/*Uma loja está vendendo seus produtos em 5 prestações sem juros.
Faça um programa que insira o valor total de uma compra e o valor das prestações.
*/package exercicios;

import java.util.Scanner;

public class ParcelaProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double compra, p2, p3, p4, p5; 
		
		System.out.print("Valor da compra R$ ");
		compra = leia.nextDouble();
		
		p2 = compra/2;
		p3 = compra/3;
		p4 = compra/4;
		p5 = compra/5;
		
		System.out.printf("\nÀ vista R$ %.2f",compra);
		System.out.printf("\n2 vezes sem juros de R$ %.2f",p2);
		System.out.printf("\n3 vezes sem juros de R$ %.2f",p3);
		System.out.printf("\n4 vezes sem juros de R$ %.2f",p4);
		System.out.printf("\n5 vezes sem juros de R$ %.2f",p5);
		
		leia.close();
	}

}
