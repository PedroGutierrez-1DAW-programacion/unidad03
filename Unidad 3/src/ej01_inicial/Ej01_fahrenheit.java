package ej01_inicial;

import java.util.Scanner;

public class Ej01_fahrenheit {

	public static void main(String[] args) {
		
		// Leemos la temperatura
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Temperatura en Fahrenheit (�F):");
		double temperatura = teclado.nextDouble();
		
		// Pasar a �C
		temperatura = (temperatura - 32) / 1.8;
		
		System.out.println("Temperatura de " + Math.round(temperatura) + "�C");
		
		if(temperatura < 0)
			System.out.println("[ALERTA] Temperatura de congelaci�n.");
		else
			System.out.println("[AVISO] Temperatura correcta.");
		
		teclado.close();

	}

}
