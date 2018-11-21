/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.tutorial.poo.ejemplos.cajero.negocio;

/**
 * <p>Transaccion tipo deposito</p>
 *
 * @author gerardo
 *
 */
public class Deposito extends Transaccion{

	@Override
	public void operarTransaccion() {
		int monto = getLector().solicitarMonto();
		getSaldo().depositar(monto);
		getSaldo().mostrarSaldo();
	}

}
