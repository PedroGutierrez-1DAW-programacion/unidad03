package ej01_inicial;

import java.util.Scanner;

public class Ej02_mostrarPar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Número:");
		int numero = teclado.nextInt();
		
		if(numero%2 == 0)
			System.out.println("Número par: " + numero);
		
		teclado.close();
	}

}
