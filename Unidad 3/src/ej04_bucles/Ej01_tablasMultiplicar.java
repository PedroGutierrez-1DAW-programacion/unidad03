package ej04_bucles;

import java.util.Scanner;

public class Ej01_tablasMultiplicar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		
		for(int i=1; i<=10; i++)
			System.out.println(n + " * " + i + " = " + (n*i));
		
		teclado.close();

	}

}
