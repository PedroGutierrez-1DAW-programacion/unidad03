package ej09_masEjercicosPracticos;

import java.util.Scanner;
import java.util.Vector;

public class Ej03_sueldo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int media = 0;
		Vector<Ej03_sueldo_empleado> empleados = new Vector<Ej03_sueldo_empleado>();
		
		do{
			String nombre;
			int sueldo;
			System.out.print("Nombre del empleado: ");
			nombre = teclado.nextLine();
			System.out.print("Sueldo del empleado: ");
			sueldo = teclado.nextInt();
			teclado.nextLine();
			empleados.add(new Ej03_sueldo_empleado(nombre, sueldo));
			System.out.println("\n¿Otro empleado? [s/n]");
		}while("s".equals(teclado.nextLine()));

		for(int i=0; i<empleados.size(); i++)
			media += empleados.elementAt(i).getSueldo();
		media /= empleados.size();
		
		System.out.println("Sueldo medio: " + media + "\n");

		for(int i=0; i<empleados.size(); i++)
			if(media<empleados.elementAt(i).getSueldo())
				System.out.println("El sueldo de " + empleados.elementAt(i).getNombre() + " es superior a la media.");
		
		
		teclado.close();

	}

}
