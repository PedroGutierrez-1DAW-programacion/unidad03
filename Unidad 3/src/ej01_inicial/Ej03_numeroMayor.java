package ej01_inicial;

import java.util.Scanner;

public class Ej03_numeroMayor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Número:");
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		
		System.out.println("Número mayor: " + (n1>n2?n1:n2));

		teclado.close();
	}

	
}
