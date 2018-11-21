/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.tutorial.poo.ejemplos.cajero.objetos;

/**
 * <p>Marca tipo operacion</p>
 *
 * @author gerardo
 *
 */
public enum TipoOperacion {
	CONSULTA_SALDO(1),
	DEPOSITO(2), 
	GIRO(3), 
	SALIR(4), 
	INVALIDA(0);
	
	private int operacionId;

	private TipoOperacion(int operacionId) {
		this.operacionId = operacionId;
	}
	
	public int getOperacionId() {
		return this.operacionId;
	}	
	
}
