package ej02_switch;

import java.util.Scanner;

public class Ej01_diasSemana {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("D�a de la semana:");
		int dia = teclado.nextInt();
		
		switch(dia){
			case 1: System.out.println("Lunes"); break;
			case 2: System.out.println("Martes"); break;
			case 3: System.out.println("Mi�rcoles"); break;
			case 4: System.out.println("Jueves"); break;
			case 5: System.out.println("Viernes"); break;
			case 6: System.out.println("S�bado"); break;
			case 7: System.out.println("Domingo"); break;
			default: System.out.println("N�mero erroneo"); break;
		}
		
		teclado.close();
	}
}
