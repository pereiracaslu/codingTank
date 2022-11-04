/*Escreva um programa que realize o c�lculo do empr�stimo a juros compostos. Onde definimos:
 o valor da vari�vel de quanto a pessoa quer emprestado;
em quantos meses ela ir� pagar
A taxa de juros ser� de 2% ao m�s
F�rmula: M = C * (1+i)^t
M = valor final ap�s a aplica��o dos juros
C = valor que a pessoa vai pegar emprestado
i � a taxa de juros
t � o tempo
Dever� exibir quanto a pessoa ir� pagar ap�s a aplica��o dos juros
 */

package exercicios;

import java.util.Scanner;

public class Juros {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double montante, c=0, capital, meses, t=0; 
		
		do {
		System.out.print("\t\tOl�, bem vindo a Ada emprestimos.\nEscolha a carta de cr�dito abaixo:\n"
				+ "1 - R$ 2.000,00\n2 - 5.000,00\n3 - 10.0000,00 \n4 - 20.000,00"
				+ "\nDigite o n�mero da op��o desejada: ");
		capital=leia.nextInt();
		
		if (capital <1 || capital >4){
			System.out.println("Op��o inv�lida, tente novamente!!!\n\n");
		}
		
		}while(capital <1 || capital >4);
	
		
		if (capital ==1) {
			c=2000;
		}
		if (capital ==2) {
			c=5000;
		}
		if (capital ==3) {
			c=10000;
		}
		if (capital ==4) {
			c=20000;
		}
		
		
		System.out.print("\n\nQuanto tempo deseja pagar?"
				+ "\n1 - 12 meses\n2 - 24 meses\n3 - 36 meses\n4 - 48 meses\nDigite o n�mero da op��o desejada: ");
		meses=leia.nextInt();
		
		do {
			if (meses <1 || meses >4){
				System.out.println("Op��o inv�lida, tente novamente!!!\n\n");
			}
		
		if(meses==1){
			t=12;
		}
		if(meses==2){
			t=24;
		}
		if(meses==3){
			t=36;
		}
		if(meses==4){
			t=48;
		}
		
		
		
		
		}while(capital <1 || capital >4);
		
		montante = c * Math.pow((1.02), t);
		
		System.out.printf("\nValor a ser pago: %.2f", montante);
		
		leia.close();
		}
	}
