package ej05_for;

import java.util.Scanner;

public class Ej04_mediaNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Cantidad de números:");
		double	r = 0,
				m = teclado.nextInt();
		System.out.println("--------------------");
		
		boolean pares = false;
		
		for(int i=0; i<m; i++){
			int n = teclado.nextInt();
			r += n;
			if(n%2<1) pares = true;
		}

		System.out.println("--------------------");

		System.out.println("Media: " + Math.round(r / m * 100) / 100.0);
		System.out.println((pares ? "Con" : "Sin") + " pares");
		
		teclado.close();

	}

}
