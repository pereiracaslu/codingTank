/*Crie um programa que você atribua um valor da idade de uma pessoa e 
calcule quantos dias aquela pessoa já viveu*/

package exercicios;

import java.util.Scanner;

public class DiasVividos {

	public static void main(String[] args) {
		int idade, meses, dias, diasVividos;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Entre com a idade em anos: ");
		idade = leia.nextInt();
		
		System.out.print("\nQuantos meses completos se passaram do seu ultimo aniversário: ");
		meses = leia.nextInt();
		
		System.out.print("\nQuantos dias faltam para o seu mesversário: ");
		dias = leia.nextInt();
		
		meses *=30;
		
		idade *=365;
		
		diasVividos = idade + meses + dias;
		
		System.out.print("Dias vividos: "+diasVividos);
		
		leia.close();
		
		
		
	}

}
