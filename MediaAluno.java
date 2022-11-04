/* Escreva um programa que leia o nome de um aluno e as notas das 3 primeiras provas que ele 
	obteve no semestre.
 No final deverá informar a média do aluno. */
package exercicios;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		String nome;
		double n1, n2, n3, media=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nome do aluno(a): ");
		nome = leia.nextLine();
		System.out.print("Entre com a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.print("Entre com a segunda nota: ");
		n2 = leia.nextDouble();
		System.out.print("Entre com a terceira nota: ");
		n3 = leia.nextDouble();
		
		media = (n1+n2+n3)/3;
		
		System.out.printf("\nMédia do aluno(a) "+nome+" foi de %.2f",media);
		
		leia.close();
	}

}
