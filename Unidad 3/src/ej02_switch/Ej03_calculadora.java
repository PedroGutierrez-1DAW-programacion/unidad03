package ej02_switch;

import java.util.Scanner;

public class Ej03_calculadora {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n1 = teclado.nextInt();
		String operador = teclado.next();
		int n2 = teclado.nextInt();
		
		System.out.println("=");
		
		switch(operador){
			case "+": System.out.print(n1 + n2); break;
			case "-": System.out.print(n1 - n2); break;
			case "*": System.out.print(n1 * n2); break;
			case "/": System.out.print(n1 / n2); break;
			default: System.out.print("Operador erroneo");
		}
		
		teclado.close();

	}

}
