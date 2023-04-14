package exercicios.matematica;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro: ");
       int x = entrada.nextInt();

        System.out.println("Entre com um valor inteiro: ");
        int y = entrada.nextInt();

        int soma;

        soma = x+y;
        System.out.println("Valor final "+soma);

        entrada.close();
    }

}
