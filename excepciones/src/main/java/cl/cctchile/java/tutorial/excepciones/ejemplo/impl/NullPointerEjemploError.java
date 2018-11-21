/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.excepciones.ejemplo.impl;

import cl.cctchile.java.tutorial.excepciones.ejemplo.INullPointerEjemplo;

/**
 * <p>implementa el no manejo de un objeto null.</p>
 *
 * @author gerardo
 *
 */
public class NullPointerEjemploError implements INullPointerEjemplo {


	@Override
	public void ejecutar() {
		Object o = null;
		if(o.equals("")) {
			System.out.println("Son iguales");
		}

	}

}
