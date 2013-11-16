package ej04_bucles;

import java.util.Scanner;

public class Ej05_tiraImpares {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int	n,
			i = 0;
		
		while((n = teclado.nextInt())>=0)
			if(++i%2>0) System.out.println("--->\t" + n);
		
		teclado.close();

	}

}
