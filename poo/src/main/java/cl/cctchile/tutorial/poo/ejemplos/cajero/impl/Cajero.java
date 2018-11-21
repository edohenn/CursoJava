/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.tutorial.poo.ejemplos.cajero.impl;

import cl.cctchile.tutorial.poo.ejemplos.cajero.fabrica.ObjectFactory;
import cl.cctchile.tutorial.poo.ejemplos.cajero.negocio.Transaccion;
import cl.cctchile.tutorial.poo.ejemplos.cajero.objetos.Lector;
import cl.cctchile.tutorial.poo.ejemplos.cajero.objetos.TipoOperacion;

/**
 * <p>
 * Implementa flujo cajero
 * </p>
 *
 * @author gerardo
 *
 */
public class Cajero {

	public static void main(String[] args) {
		TipoOperacion tipoOperacion = TipoOperacion.INVALIDA;
		do {
			final Lector lector = new Lector();
			tipoOperacion = lector.solicitarOpcion();
			if(TipoOperacion.INVALIDA.equals(tipoOperacion)) {
				continue;
			}	
			Transaccion transaccion = ObjectFactory.getInstancia(tipoOperacion);
			if(transaccion != null) {
				transaccion.operarTransaccion();	
			}						
		} while (!TipoOperacion.SALIR.equals(tipoOperacion));

	}

}
