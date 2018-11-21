/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.estructura.ejemplos;

/**
 * <p>
 * Descripcion funcionalidad de clase, implementacion de {@link Forma} para rectangulo.
 * </p>
 * 
 * @author gerardo.garrido
 *
 */
public class Rectangulo implements Forma {
	
	private int ladoA;
	private int ladoB;
	private TiposForma tipoForma;
	
	public Rectangulo(int ladoA, int ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		tipoForma = TiposForma.RECTANGULO;
	}

	@Override
	public int area() {
		return ladoA * ladoB;
	}

	@Override
	public int perimetro() {
		return ladoA * 2 + ladoB * 2;
	}

	@Override
	public TiposForma tipoForma() {
		return tipoForma;
	}

}
