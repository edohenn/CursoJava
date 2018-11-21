/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.tiposdedatos.ejemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Los tipos de datos especiales pertenecen , estos son cargados en el heep.
 * </p>
 * 
 * @author gerardo.garrido
 *
 */
public class TiposEspeciales {

	private String texto;
	private LocalDate fecha;
	private LocalDateTime fechaHora;
	private List<String> listaDeTextos;
	private Map<String, String> mapaClaveValor;
	private HashSet<String> listaValorUnico;

	/**
	 * @param texto
	 * @param fecha
	 * @param fechaHora
	 * @param listaDeTextos
	 * @param mapaClaveValor
	 * @param listaValorUnico
	 */
	public TiposEspeciales(String texto, LocalDate fecha, LocalDateTime fechaHora, List<String> listaDeTextos,
			Map<String, String> mapaClaveValor, HashSet<String> listaValorUnico) {
		super();
		this.texto = texto;
		this.fecha = fecha;
		this.fechaHora = fechaHora;
		this.listaDeTextos = listaDeTextos;
		this.mapaClaveValor = mapaClaveValor;
		this.listaValorUnico = listaValorUnico;
	}

	/**
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * @param texto the texto to set
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the fechaHora
	 */
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	/**
	 * @param fechaHora the fechaHora to set
	 */
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	/**
	 * @return the listaDeTextos
	 */
	public List<String> getListaDeTextos() {
		return listaDeTextos;
	}

	/**
	 * @param listaDeTextos the listaDeTextos to set
	 */
	public void setListaDeTextos(List<String> listaDeTextos) {
		this.listaDeTextos = listaDeTextos;
	}

	/**
	 * @return the mapaClaveValor
	 */
	public Map<String, String> getMapaClaveValor() {
		return mapaClaveValor;
	}

	/**
	 * @param mapaClaveValor the mapaClaveValor to set
	 */
	public void setMapaClaveValor(Map<String, String> mapaClaveValor) {
		this.mapaClaveValor = mapaClaveValor;
	}

	/**
	 * @return the listaValorUnico
	 */
	public HashSet<String> getListaValorUnico() {
		return listaValorUnico;
	}

	/**
	 * @param listaValorUnico the listaValorUnico to set
	 */
	public void setListaValorUnico(HashSet<String> listaValorUnico) {
		this.listaValorUnico = listaValorUnico;
	}

	@Override
	public String toString() {
		return "TiposEspeciales [texto=" + texto + ", fecha=" + fecha + ", fechaHora=" + fechaHora + ", listaDeTextos="
				+ listaDeTextos + ", mapaClaveValor=" + mapaClaveValor + ", listaValorUnico=" + listaValorUnico + "]";
	}

}
