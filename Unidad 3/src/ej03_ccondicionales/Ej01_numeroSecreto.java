package ej03_ccondicionales;

import java.util.Scanner;

public class Ej01_numeroSecreto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numeroSecreto = (int)(Math.random() * 10 + 1);
		
		while(numeroSecreto != teclado.nextInt())
			System.out.println("N�mero err�neo.");
		System.out.println("N�mero correcto.");

		teclado.close();

	}

}
