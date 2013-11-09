package ej03_ccondicionales;

import java.util.Scanner;

public class Ej03_rebajas {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double precio = teclado.nextDouble();

		if(precio < 20)
			System.out.println("Descuento del 10%: " + Math.round(precio * 0.9 * 100) / 100.0);
		else if(precio < 50)
			System.out.println("Descuento del 20%: " + Math.round(precio * 0.8 * 100) / 100.0);
		else
			System.out.println("Descuento del 25%: " + Math.round(precio * 0.75 * 100) / 100.0);

		teclado.close();

	}
}
