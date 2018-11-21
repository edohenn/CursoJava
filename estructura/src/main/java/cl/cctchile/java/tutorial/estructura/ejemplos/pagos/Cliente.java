/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.estructura.ejemplos.pagos;

/**
 * <p>
 * Clase cliente
 * </p>
 *
 * @author gerardo
 *
 */
public class Cliente {

	private String rut;
	private String banco;

	/**
	 * @param rut
	 * @param banco
	 */
	public Cliente(String rut, String banco) {
		super();
		this.rut = rut;
		this.banco = banco;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the banco
	 */
	public String getBanco() {
		return banco;
	}

	/**
	 * @param banco the banco to set
	 */
	public void setBanco(String banco) {
		this.banco = banco;
	}

}
