/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.ejerciciouno;

import java.util.Arrays;
import java.util.List;

import cl.cctchile.java.tutorial.ejerciciouno.fibonacci.Fibonacci;
import cl.cctchile.java.tutorial.ejerciciouno.fibonacci.IFibonacci;
import cl.cctchile.java.tutorial.ejerciciouno.listas.IListaOrdenada;
import cl.cctchile.java.tutorial.ejerciciouno.listas.ListasOrdenadas;

/**
 * <p>
 * Ejecucion ejercicio fibonacci
 * </p>
 *
 * @author gerardo
 *
 */
public class ClasePrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// EJERCICIO FIBONACCI
		IFibonacci fibonacci = new Fibonacci();
		fibonacci.prepararSerie("Primer Serie", 10);
		fibonacci.mostrarSerie();
		System.out.println("");

		// EJERCICIO ORDENAR LISTAS.
		List<Integer> lista = Arrays.asList(20, 10, 1, 40, 23, 38, 12);
		IListaOrdenada ordenar = new ListasOrdenadas(lista);

		List<Integer> descendente = ordenar.ordenarListaDescendente();
		descendente.forEach(valor -> System.out.print(valor + " "));
		System.out.println("");
		
		List<Integer> ascendente = ordenar.ordenarListaAscendente();
		ascendente.forEach(valor -> System.out.print(valor + " "));
		System.out.println("");
		
		if (ordenar.existeValor(Integer.valueOf("10"))) {
			System.out.println("SI existe valor 10");
		} else {
			System.out.println("NO existe valor 10");
		}

		if (ordenar.existeValor(Integer.valueOf("22"))) {
			System.out.println("SI existe valor 22");
		} else {
			System.out.println("NO existe valor 22");
		}

	}

}
