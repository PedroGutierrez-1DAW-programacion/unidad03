package ej08_ejercicosPracticos;

public class Ej03_piramides {

	public static void main(String[] args) {
		
		int largo = 6;
		piramide(1, largo);
		piramide(2, largo);
		piramide(3, largo);
	
	}

	private static void piramide(int tipo, int largo) {
		int i = 0;
		while(i++<largo){
			String linea = "";

			switch(tipo){
				case 2:linea += espacios(largo - i);
				case 1:linea += puntos(i); break;
				case 3:linea += espacios(largo - i) + puntos((i - 1) * 2 + 1); break;
			}
			System.out.println(linea);
		}
		System.out.println("\n-------------\n");
		
	}

	private static String puntos(int i) {
		String r="";
		while(i-->0) r+="*";
		return r;
	}

	private static String espacios(int i) {
		String r="";
		while(i-->0) r+=" ";
		return r;
	}

}
