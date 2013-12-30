package ej10_metodos;

import java.util.Scanner;

public class Ej02_fahrenheitCelsius {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while(true){
			System.out.print("Temperatura [ºF]: ");
			int n = teclado.nextInt();
			if(n==999) break;
			System.out.println(fahrenheitCelsius(n) + " ºC");
		}
		teclado.close();
	}

	private static int fahrenheitCelsius(int farenheit) {
		return (int)( 5.0/9.0 * (farenheit - 32.0));
	}

}
