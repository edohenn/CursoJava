/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.estructura.ejemplos;

/**
 * <p>Una interface solo declara funcionalidades y no especifica como se hace.</p>
 * 
 * @author gerardo.garrido
 *
 */
public interface Forma {

	/**
	 * retorna el valor del area para la forma dada
	 * 
	 * @return
	 */
	int area();
	
	/**
	 * retorna el valor del perimetro para la forma dada
	 * @return
	 */
	int perimetro();
	
	/**
	 * retorna el tipo de forma
	 * @return
	 */
	TiposForma tipoForma();
	
}
