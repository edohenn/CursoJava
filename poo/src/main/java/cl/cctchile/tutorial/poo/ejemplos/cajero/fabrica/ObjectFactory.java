/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.tutorial.poo.ejemplos.cajero.fabrica;

import cl.cctchile.tutorial.poo.ejemplos.cajero.negocio.Consulta;
import cl.cctchile.tutorial.poo.ejemplos.cajero.negocio.Deposito;
import cl.cctchile.tutorial.poo.ejemplos.cajero.negocio.Giro;
import cl.cctchile.tutorial.poo.ejemplos.cajero.negocio.Transaccion;
import cl.cctchile.tutorial.poo.ejemplos.cajero.objetos.TipoOperacion;

/**
 * <p>Fabrica de objetos tipo operacionales.</p>
 *
 * @author gerardo
 *
 */
public class ObjectFactory {

	public static Transaccion getInstancia(TipoOperacion tipoOperacion) {
		switch (tipoOperacion) {
		case CONSULTA_SALDO:
			return new Consulta();
		case GIRO:
			return new Giro();
		case DEPOSITO:
			return new Deposito();
		default:
			return null;
		}
	}
	
}
