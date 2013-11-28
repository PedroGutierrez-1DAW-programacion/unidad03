package ej07_buclesGraficos;

import graphics.*;

public class Ej03_ajedrez {

	public static void main(String[] args) {
		int	x = 8,
			Y = 8,
			d = 20,
			i = 10;
		Color b = new Color(160,160,160);
		
		while(x-->0)
			for(int y=Y; y-->0;)
				if((x+y)%2<1){
					Rectangle r = new Rectangle(i+(x*d),i+(y*d),d,d);
					r.setColor(b);
					r.fill();
				}
				

	}

}
