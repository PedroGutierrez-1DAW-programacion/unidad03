package ej03_ccondicionales;

import java.util.Scanner;

public class Ej05_anioBisiesto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Año:");
		int anio = teclado.nextInt();
		
		System.out.println( anio%4 == 0 && (anio%100 != 0 || anio%400 == 0)? "Es bisiesto" : "No es bisiesto");
		
		teclado.close();

	}

}
