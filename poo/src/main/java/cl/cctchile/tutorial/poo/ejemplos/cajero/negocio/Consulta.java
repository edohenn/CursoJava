/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.tutorial.poo.ejemplos.cajero.negocio;

/**
 * <p>Transaccion de tipo consulta</p>
 *
 * @author gerardo
 *
 */
public class Consulta extends Transaccion{

	@Override
	public void operarTransaccion() {
		getSaldo().mostrarSaldo();
	}

}
