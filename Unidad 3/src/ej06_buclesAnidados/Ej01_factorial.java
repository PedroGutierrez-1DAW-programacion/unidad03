package ej06_buclesAnidados;

import java.util.Scanner;

public class Ej01_factorial {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
				
		do{
			System.out.println("Número:");
			long r = 1;
			
			for(int i=1,n=teclado.nextInt(); i<=n; i++)
				r *= i;

			System.out.println("Resultado: " + r);
			System.out.println("----------\n¿Quiere insetar otro número [s/n]?");
		}while((teclado.next()).equals("s"));
		
		teclado.close();
	}
}
