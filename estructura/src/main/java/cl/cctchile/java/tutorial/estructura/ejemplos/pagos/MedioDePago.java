/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.estructura.ejemplos.pagos;


/**
 * <p>Una interface solo declara funcionalidades y no especifica como se hace.</p>
 * 
 * @author gerardo.garrido
 *
 */
public interface MedioDePago {

	/**
	 * @param cliente
	 * @return
	 */
	long iniciarTransaccion(Cliente cliente);
	
	/**
	 * @param transaccionID
	 * @return
	 */
	boolean pagar(long transaccionID);
	
	/**
	 * @param transaccionID
	 * @return
	 */
	boolean reversar(long transaccionID);
	
}
