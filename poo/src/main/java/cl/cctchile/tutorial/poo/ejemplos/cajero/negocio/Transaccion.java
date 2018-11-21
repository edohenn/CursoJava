/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.tutorial.poo.ejemplos.cajero.negocio;

import cl.cctchile.tutorial.poo.ejemplos.cajero.objetos.Lector;
import cl.cctchile.tutorial.poo.ejemplos.cajero.objetos.Saldo;

/**
 * <p>Herencia + polimorfismo</p>
 *
 * @author gerardo
 *
 */
public abstract class Transaccion {

	private static Saldo saldo = new Saldo(10000);
	private Lector lector;
	
	public abstract void operarTransaccion();
	
	public Transaccion() {
		lector = new Lector();
	}

	protected Saldo getSaldo() {
		return saldo;
	}
	
	protected Lector getLector() {
		return lector;
	}
}
