package ej10_metodos;

public class Ej03_capicua {

	public static void main(String[] args) {

		System.out.println(capicua(21023) ? "Es capicua" : "No es capicua");
		System.out.println(capicua(21112) ? "Es capicua" : "No es capicua");
		System.out.println(capicua(391888193) ? "Es capicua" : "No es capicua");

	}

	private static boolean capicua(int num) {
		boolean capicua = true;
		String numero = (new Integer(num)).toString();
		int[] n = new int[numero.length()];
		
		// Pasamos el número a un 
		for(int i=0; i<n.length; i++)
			n[i] = numero.charAt(i) - 48;
		
		for(int i=0; i<(n.length / 2); i++)
			if(n[i] != n[n.length-i-1]) capicua = false;

		return capicua;
	}

}
