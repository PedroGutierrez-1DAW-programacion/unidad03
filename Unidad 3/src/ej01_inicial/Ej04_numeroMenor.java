package ej01_inicial;

import java.util.Scanner;

public class Ej04_numeroMenor {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("N�mero:");
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		int n3 = teclado.nextInt();
		
		System.out.println("N�mero menor: " + (n1<n2&&n1<n3?n1:n2<n3?n2:n3));

		teclado.close();

	}

}
