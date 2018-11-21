/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.estructura.ejemplos;

/**
 * <p>
 * Descripcion funcionalidad de clase, implementacion de {@link Forma} para cuadrado.
 * </p>
 * 
 * @author gerardo.garrido
 * @version 1.0
 *
 */
public class Cuadrado implements Forma {

	// almacena largo lado cuadrado.
	private int lado;
	// guarda el tipo de forma.
	private TiposForma tipoForma;

	public Cuadrado(int lado) {
		this.lado = lado;
		tipoForma = TiposForma.CUADRADO;
	}

	// ----------------------------
	// sobre escritura de metodos.
	// ----------------------------
	@Override
	public int area() {
		return lado * lado;
	}

	@Override
	public int perimetro() {
		return lado * 4;
	}

	@Override
	public TiposForma tipoForma() {
		return tipoForma;
	}

}
