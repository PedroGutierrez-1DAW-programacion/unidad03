package ej04_bucles;

import java.util.Scanner;

public class Ej06_calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String operador;
		boolean seguir = true;
		System.out.println("Perimer operador");
		int n1 = teclado.nextInt();
		System.out.println("Segundo operador");
		int n2 = teclado.nextInt();
		
		while(seguir){
			System.out.println("\nAcción");
			operador = teclado.next();
			switch(operador){
				case "+": System.out.println(n1 + n2); break;
				case "-": System.out.println(n1 - n2); break;
				case "*": System.out.println(n1 * n2); break;
				case "/": System.out.println(n1 / n2); break;
				default:
					System.out.print("Operador erroneo");
					seguir = false;
			}
		}
		
		teclado.close();

	}

}
