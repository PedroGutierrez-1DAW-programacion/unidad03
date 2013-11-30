package ej08_ejercicosPracticos;

import java.util.Scanner;

public class Ej01_capicua {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String numero = teclado.next();
		boolean capicua = false;
		int[] n = new int[numero.length()];
		
		// Pasamos el número a un 
		for(int i=0; i<n.length; i++)
			n[i] = numero.charAt(i) - 48;
		
		for(int i=0; i<(n.length / 2); i++)
			if(n[i] != n[n.length-i-1]) capicua = true;
		
		System.out.println(capicua?"No es capicua":"Es capicua");

		
		teclado.close();

	}

}
