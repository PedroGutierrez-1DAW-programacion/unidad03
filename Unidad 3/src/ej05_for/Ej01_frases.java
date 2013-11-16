package ej05_for;

import java.util.Scanner;

public class Ej01_frases {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
			System.out.println(teclado.nextLine());
		
		teclado.close();
	}

}
