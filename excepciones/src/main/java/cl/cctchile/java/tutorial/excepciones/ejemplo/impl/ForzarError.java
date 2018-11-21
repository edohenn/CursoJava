/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.excepciones.ejemplo.impl;

import cl.cctchile.java.tutorial.excepciones.ejemplo.IForzarError;

/**
 * <p>Clase para forzar error de memoria</p>
 *
 * @author gerardo
 *
 */
public class ForzarError implements IForzarError {

	@Override
	public void haciendoAlgoIndebido() throws InterruptedException {
		int iterar = 20;
		for (int contador = 1; contador < 20; contador++) {
			int loop1 = 2;
			int[] memoryFillIntVar = new int[iterar];
			do {
				memoryFillIntVar[loop1] = 0;
				loop1--;
			} while (loop1 > 0);
			iterar = iterar * 5;
			Thread.sleep(1000);
		}
	}

}
