package ej07_buclesGraficos;

import graphics.Color;
import graphics.Ellipse;

public class Ej01_diana {

	public static void main(String[] args) {
		
		int separacion = 10;
		int circulos = 10;
		
		for(int i=0; i<circulos; i++){
			int diametro = (circulos - i) * separacion * 2;
			Ellipse circulo = new Ellipse(
				separacion * (i + 1), separacion * (i + 1),
				diametro, diametro
			);
			circulo.setColor(new Color(r(),r(),r()));
			circulo.fill();
		}

	}

	private static int r() {
		return (int)(Math.random() * 256);
	}

}
