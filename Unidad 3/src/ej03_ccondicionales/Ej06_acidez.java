package ej03_ccondicionales;

import java.util.Scanner;

public class Ej06_acidez {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Acidez:");
		double acido = teclado.nextDouble();
		
		System.out.println( acido > 3 ? acido > 7 ? "No es ácido" : "Es ácido" : "Es extremadamente ácido");
		
		teclado.close();

	}

}
