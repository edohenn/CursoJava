/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.ejerciciouno.fibonacci;

/**
 * <p>Interface provee metodos fibonacci</p>
 *
 * @author gerardo
 *
 */
public interface IFibonacci {

	/**
	 * permite setear valores
	 * 
	 * @param nombre
	 * @param largo
	 */
	void prepararSerie(String nombre, int largo);
	
	/**
	 * debe mostrar el nombre de la serie.
	 * debe mostrar la serie fibonacci calculada hasta el largo indicado.
	 * 
	 */
	void mostrarSerie();
	
}
