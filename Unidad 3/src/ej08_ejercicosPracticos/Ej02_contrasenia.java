package ej08_ejercicosPracticos;

import java.util.Scanner;

public class Ej02_contrasenia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int intentos = 3;
		String clave = "qwerty";
		boolean acertado = false;
		
		while(intentos-->0 && !acertado){
			System.out.print("Contraseņa: ");
			if(clave.equals(teclado.nextLine()))
				acertado = true;
		}
		
		System.out.println(acertado?"[Contreaseņa correcta]":"[Error]");
		
		
		teclado.close();

	}

}
