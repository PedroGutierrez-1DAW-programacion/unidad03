package ej05_for;

import java.util.Scanner;

public class Ej05_sumaIntervalo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n,m,r=0;
		
		do System.out.println("Número inicial y final:");
		while((n = teclado.nextInt()) >= (m = teclado.nextInt()));
		
		//for(; n<=m; n++) r += n;
		while(n<=m) r += n++;
		
		System.out.println("Resultado: " + r);
		
		teclado.close();

	}

}
