package ej01_inicial;

import java.util.Scanner;

public class Ej01_fahrenheit {

	public static void main(String[] args) {
		
		// Leemos la temperatura
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Temperatura en Fahrenheit (ºF):");
		double temperatura = teclado.nextDouble();
		
		// Pasar a ºC
		temperatura = (temperatura - 32) / 1.8;
		
		System.out.println("Temperatura de " + Math.round(temperatura) + "ºC");
		
		if(temperatura < 0)
			System.out.println("[ALERTA] Temperatura de congelación.");
		else
			System.out.println("[AVISO] Temperatura correcta.");
		
		teclado.close();

	}

}
