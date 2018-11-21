/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.ejerciciouno.listas;

import java.util.List;

/**
 * <p>Describe metodos de orden.</p>
 *
 * @author gerardo
 *
 */
public interface IListaOrdenada {

	/**
	 * Debe retornar la lista de forma ordenada descendente
	 * @return
	 */
	List<Integer> ordenarListaDescendente();
	
	/**
	 * Debe retornar la lista de forma ordenada ascendente
	 * @return
	 */
	List<Integer> ordenarListaAscendente();
	
	/**
	 * Debe buscar valores en la lista con lambda
	 * @param valor
	 * @return
	 */
	boolean existeValor(Integer valor);
}
