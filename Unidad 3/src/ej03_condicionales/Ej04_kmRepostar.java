package ej03_condicionales;

import java.util.Scanner;

public class Ej04_kmRepostar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Listros del depósito:");
		double deposito = teclado.nextDouble();

		System.out.println("Porcentaje del depósito lleno:");
		double cantidad = teclado.nextDouble();
		
		System.out.println("Consumo de combustible (l/100km):");
		double consumo = teclado.nextDouble();
		
		double litosRestantes = deposito * cantidad / 100.0;
		
		int kmRestantes = (int)(litosRestantes / consumo * 100);
		
		System.out.println((kmRestantes<30?"[Reserva] ":"") + "Kilómetros restantes: " + kmRestantes);
		
		teclado.close();

	}

}
