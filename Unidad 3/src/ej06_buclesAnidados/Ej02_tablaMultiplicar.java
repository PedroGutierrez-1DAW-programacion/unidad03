package ej06_buclesAnidados;

import java.util.Scanner;

public class Ej02_tablaMultiplicar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		
		while((n = teclado.nextInt())>0 && n<=10)
			tablaMultiplicar(n);
			
		teclado.close();
	}

	private static void tablaMultiplicar(int n) {
		for(int i=1; i<=10; i++)
			System.out.println(n + " * " + i + " = " + (n*i));
	}

}
