/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.excepciones.ejemplo.impl;

import cl.cctchile.java.tutorial.excepciones.ejemplo.INullPointerEjemplo;

/**
 * <p>Manipulando un error de null pointer.</p>
 *
 * @author gerardo
 *
 */
public class NullPointerEjemploManejado implements INullPointerEjemplo {

	@Override
	public void ejecutar() {
		Object o = null;
		try {
			if(o.equals("")) {
				System.out.println("Son iguales");
			}
		}catch (NullPointerException e) {
			System.out.println("El objeto es nulo, pero el programa no cae.");
		}

	}

}
