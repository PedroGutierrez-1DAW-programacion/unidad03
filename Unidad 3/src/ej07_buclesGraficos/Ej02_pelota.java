package ej07_buclesGraficos;

import graphics.*;

public class Ej02_pelota {
	private final static int ancho = 600; // Alto de la urna
	private final static int alto = 400; // Ancho de la urna
	private final static int inicio = 10; // Inicio de la urna
	private final static double gravedad = 0.999; // Fuerza de deceleración de la pelota
	private final static int diametroPelota = 40; // Diámetro de la pelota
	private static double deceleracion = 1; // Capacidad de bote
	private static double velX; // Almacenan la velocidad del eje X;
	private static int altura = 0; // Altura de la pelota (incremento constante)
	private static boolean dirX; // Dirección en eje X
	private static Ellipse pelota; // Pelota

	public static void main(String[] args) throws InterruptedException {

		generarUrna();
		generarPelota();
		establecerVelocidad();
		botar();

	}

	private static void generarUrna() {
		Rectangle fondo = new Rectangle(inicio, inicio, ancho, alto);
		fondo.setColor(new Color(80, 80, 80));
		fondo.fill();		
	}

	private static void generarPelota() {
		pelota = new Ellipse(
			inicio + (ancho / 2) - (diametroPelota / 2),
			inicio + (diametroPelota / 2),
			diametroPelota, diametroPelota
		);
		pelota.setColor(new Color(200, 200, 200));
		pelota.fill();		
	}
	private static void generarPelota(double dx, double dy) {
		pelota = new Ellipse(dx, dy, diametroPelota, diametroPelota);
		pelota.setColor(new Color(200, 200, 200));
		pelota.fill();		
	}

	private static void establecerVelocidad() {
		double maxX = 1.5;
		velX = Math.random() * maxX;
		dirX = (Math.random()*2.0) <= 1;
	}

	private static void botar() throws InterruptedException {
		double inicioY = inicio + (diametroPelota / 2);
		double altoY = alto - inicio - (diametroPelota / 2);
		while(true){
			Thread.sleep(1000 / 60);
			dirX = enBordeX();
			double dx = dirX ? velX : -velX;
			double dy = altoY - (Math.abs(Math.cos(altura++ / 60.0)) * (altoY - inicioY) * (deceleracion *= gravedad));
			moverPelota(pelota, pelota.getX() + dx, dy);
		}
	}

	private static boolean enBordeX() {
		if((pelota.getX() - velX) < inicio && !dirX)
			return true;
		if((pelota.getX() + velX) > (inicio + ancho - diametroPelota) && dirX)
			return false;
		return dirX;
	}

	private static void moverPelota(Ellipse p, double dx, double dy) {
		generarUrna();
		generarPelota(dx, dy);
	}
	
	

}