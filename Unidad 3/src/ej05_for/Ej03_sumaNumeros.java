package ej05_for;

import java.util.Scanner;

public class Ej03_sumaNumeros {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int r=0;
		
		for(int i=0; i<6; i++)
			r += teclado.nextInt();
		
		System.out.println("Resultado: " + r);
		
		teclado.close();

	}

}
