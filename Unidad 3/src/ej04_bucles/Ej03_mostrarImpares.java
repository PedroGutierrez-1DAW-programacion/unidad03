package ej04_bucles;

import java.util.Scanner;

public class Ej03_mostrarImpares {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n;
		
		while((n = teclado.nextInt())%2>0)
			System.out.println("--->\t"+n);
		
		teclado.close();

	}

}
