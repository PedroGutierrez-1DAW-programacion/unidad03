package ej04_bucles;

import java.util.Scanner;

public class Ej02_multiplicarNumeros {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int	i, n, r = 1;
		
		for(i=0; (n = teclado.nextInt())!=0; i++)
			r *= n;
		
		System.out.println( "Resultado: " + r + " [" + i + " números]");
		
		teclado.close();

	}

}
