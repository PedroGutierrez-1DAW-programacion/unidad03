package ej06_buclesAnidados;

import java.util.Scanner;

public class Ej03_piedraPapelTijera {
	
	private static final int[][] resultados = {{1,2,0},{2,1,0},{0,2,1}};
	private static final String[] acciones = {"Piedra", "Papel", "Tijeras"};
	private static final Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		do partidaNueva();
		while((teclado.nextLine()).equals("s"));
		
		teclado.close();
	}

	private static void partidaNueva() {
		int IA = (int)(Math.random() * 3);
		boolean error = true;

		System.out.println("Acción [piedra, papel, tijera]:");
		while(error){
			error = false;
			switch(teclado.nextLine()){
				case "piedra": ganador(0, IA); break;
				case "papel": ganador(1, IA); break;
				case "tijera": ganador(2, IA); break;
				default:
					System.out.println("Acción [piedra, papel, tijera]:");
					error = true;
			}
		}
		System.out.println("-------------\n¿Otra partida [s/n]?");
	}

	private static void ganador(int a, int i) {
		System.out.println(acciones[a] + " - " + acciones[i]);
		System.out.println(
			resultados[a][i] == 0 ? "Pierdes" :
			resultados[a][i] == 1 ? "Empate" : "Ganas"
		);
	}

}
