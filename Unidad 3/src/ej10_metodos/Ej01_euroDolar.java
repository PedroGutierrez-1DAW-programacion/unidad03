package ej10_metodos;

public class Ej01_euroDolar {

	public static void main(String[] args) {

		System.out.println(euroDolar(1.34));
		System.out.println(euroDolar(1.2) + euroDolar(2));

	}

	private static double euroDolar(double euro) {
		double dolarPorEuro = 1.3734;
		return euro * dolarPorEuro;
	}

}
