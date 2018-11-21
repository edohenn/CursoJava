/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.ejerciciouno.listas;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Implementa metodos para manipular listas de forma ordenada
 * </p>
 *
 * @author gerardo
 *
 */
public class ListasOrdenadas implements IListaOrdenada {

	private final List<Integer> lista;

	public ListasOrdenadas(List<Integer> lista) {
		this.lista = lista;
	}

	@Override
	public List<Integer> ordenarListaDescendente() {
		List<Integer> retorno = copiarLista(lista);
		retorno.sort((valor1, valor2) -> Integer.compare(valor1, valor2));
		return retorno;
	}

	@Override
	public List<Integer> ordenarListaAscendente() {
		List<Integer> retorno = copiarLista(lista);
		retorno.sort((valor1, valor2) -> Integer.compare(valor2, valor1));
		return retorno;
	}

	@Override
	public boolean existeValor(Integer valor) {
		return lista.contains(valor);
	}

	/**
	 * @param listaDesordenada
	 * @return
	 */
	private List<Integer> copiarLista(List<Integer> listaDesordenada) {
		List<Integer> retorno = new ArrayList<Integer>();
		lista.forEach(valor -> retorno.add(valor));
		return retorno;
	}
}
