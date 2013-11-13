package ej03_condicionales;

import java.util.Scanner;

public class Ej07_piedraPapelTijera {

	private static final int[][] resultados = {{1,2,0},{2,1,0},{0,2,1}};
	private static final String[] acciones = {"Piedra", "Papel", "Tijeras"};

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int IA = (int)(Math.random() * 3);

		System.out.println("Acción [piedra, papel, tijera]:");
		switch(teclado.nextLine()){
			case "piedra": ganador(0, IA); break;
			case "papel": ganador(1, IA); break;
			case "tijera": ganador(2, IA); break;
			default: System.out.println("Acción errónea.");
		}
		
		teclado.close();
	}

	private static void ganador(int a, int i) {
		System.out.println(acciones[a] + " - " + acciones[i]);
		System.out.println(
			resultados[a][i] == 0 ? "Pierdes" :
			resultados[a][i] == 1 ? "Empate" : "Ganas"
		);
	}

}
