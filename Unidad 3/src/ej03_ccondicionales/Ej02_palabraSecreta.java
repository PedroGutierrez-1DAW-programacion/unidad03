package ej03_ccondicionales;

import java.util.Scanner;

public class Ej02_palabraSecreta {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		String palabraSecreta = "Contrase�a123";
		
		while(!palabraSecreta.equals(teclado.nextLine()))
			System.out.println("Palabra err�nea.");
		System.out.println("Palabra correcta.");

		teclado.close();
	}
}
