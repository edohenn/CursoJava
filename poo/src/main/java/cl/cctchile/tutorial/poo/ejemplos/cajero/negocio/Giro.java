/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.tutorial.poo.ejemplos.cajero.negocio;

/**
 * <p>implemeta la operacion de giro</p>
 *
 * @author gerardo
 *
 */
public class Giro extends Transaccion{
	
	Object o;
	public Giro() {
		super();
		o = new Object();
	}

	@Override
	public void operarTransaccion() {
		int monto = getLector().solicitarMonto();
		getSaldo().girar(monto);
		getSaldo().mostrarSaldo();
	}

}
