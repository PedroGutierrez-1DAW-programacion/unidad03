package ej09_masEjercicosPracticos;

import java.util.Scanner;

public class Ej02_numerosDistintos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		do System.out.println("Inserte dos números:");
		while((n1 = teclado.nextInt()) == (n2 = teclado.nextInt()));
		System.out.println(n1>n2?n1:n2);
		
		teclado.close();
	}
}
