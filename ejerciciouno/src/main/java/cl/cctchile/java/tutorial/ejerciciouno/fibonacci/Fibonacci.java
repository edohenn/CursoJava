/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.ejerciciouno.fibonacci;

import java.util.stream.IntStream;

/**
 * <p>
 * Implementa metodos
 * </p>
 *
 * @author gerardo
 *
 */
public class Fibonacci implements IFibonacci {

	private String nombre;
	private int largo;

	@Override
	public void prepararSerie(String nombre, int largo) {
		this.nombre = nombre;
		this.largo = largo;
	}

	@Override
	public void mostrarSerie() {
		System.out.println(String.format("La serie nombre %s debe mostrar %d elementos de fibonacci", nombre, largo));
		IntStream.range(0, largo).forEach(indice -> System.out.print(obtenerElemento(indice) + " "));
	}

	private int obtenerElemento(int indice) {
		if (indice > 1) {
			return obtenerElemento(indice - 1) + obtenerElemento(indice - 2);
		}

		if (indice == 1) {
			return 1;
		}

		if (indice == 0) {
			return 0;
		}
		System.out.println("Debes ingresar un tamaño mayor o igual a 1");
		return -1;
	}

}
