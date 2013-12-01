package ej09_masEjercicosPracticos;

import java.util.Scanner;

public class Ej01_sucesionFibonacciVariable {
	
	// http://en.wikipedia.org/wiki/Generalizations_of_Fibonacci_numbers

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		long[] buffer;
		int tipo, n,
			min = 2,
			max = 7;
		
		System.out.println("Variantes de sucesi�n de Fibonacci:");
		System.out.println("  Fibonacci 	(2 n�meros)");
		System.out.println("  Tribonacci	(3 n�meros)");
		System.out.println("  Tetranacci	(4 n�meros)");
		System.out.println("  Pentanacci	(5 n�meros)");
		System.out.println("  Hexanacci 	(6 n�meros)");
		System.out.println("  Heptanacci	(7 n�meros)\n");
		
		do	System.out.print("Variante [2~7]: ");
		while((tipo = teclado.nextInt()) < min || tipo > max );

		System.out.print("Pasos a comprobar: ");
		
		buffer = new long[tipo + teclado.nextInt()];
		buffer = iniciarBuffer(buffer, tipo);
		buffer = generarSucesion(buffer, tipo);
		

		System.out.println("Comprobar n�mero de la sucesi�n: ");
		
		while((n = teclado.nextInt()) > 0)
			System.out.println("El n�mero "+n+(comprobarEnLista(buffer, n)?" est� en la lista":" no est� en la lista"));
		
		System.out.print("\nMostrar sucesi�n [s/n]: ");
		if("s".equals(teclado.next()))
			mostrarSucesion(buffer);
		
		teclado.close();

	}

	/**
	 * Inicia la sucecci�n de Fibonacci, seg�n el tipo
	 * @param buffer Almacena los n�meros de la sucesi�n
	 * @param tipo N�mero de 0s (-1)
	 * @return 
	 */
	private static long[] iniciarBuffer(long[] buffer, int tipo) {
		buffer[tipo - 1] = 1;
		return buffer;
	}

	/**
	 * Genera la sucesi�n
	 * @param buffer Almacena los n�meros de la sucesi�n
	 * @param tipo N�meros que se evual de la sucesi�n
	 * @return 
	 */
	private static long[] generarSucesion(long[] buffer, int tipo) {
		for(int i=tipo; i<buffer.length; i++){
			for(int j=tipo; j>0; j--){
				buffer[i] += buffer[i-j];			
			}
		}
		return buffer;
	}

	private static boolean comprobarEnLista(long[] buffer, int n) {
		boolean r = false;
		for(int i=0; i<buffer.length; i++)
			if(buffer[i] == n) r = true;
		return r;
	}

	private static void mostrarSucesion(long[] buffer) {
		for(int i=0; i<buffer.length; i++)
			System.out.print(buffer[i]+" ");		
	}
	
}
