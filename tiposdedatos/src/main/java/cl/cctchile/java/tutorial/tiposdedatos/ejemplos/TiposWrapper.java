/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.tiposdedatos.ejemplos;

/**
 * <p>
 * Los tipos de datos Wrapper son datos primitivos encapsulados en un objeto que
 * expande las funcionalidades, estos son cargados en el heep.
 * </p>
 * 
 * @author gerardo.garrido
 *
 */
public class TiposWrapper {

	private Boolean booleano;
	private Byte bite;
	private Character caracter;
	private Short numeroCorto;
	private Integer numero;
	private Long numeroLargo;
	private Float numeroFlotante;
	private Double numeroExtenso;

	/**
	 * @param booleano
	 * @param bite
	 * @param caracter
	 * @param numeroCorto
	 * @param numero
	 * @param numeroLargo
	 * @param numeroFlotante
	 * @param numeroExtenso
	 */
	public TiposWrapper(Boolean booleano, Byte bite, Character caracter, Short numeroCorto, Integer numero,
			Long numeroLargo, Float numeroFlotante, Double numeroExtenso) {
		super();
		this.booleano = booleano;
		this.bite = bite;
		this.caracter = caracter;
		this.numeroCorto = numeroCorto;
		this.numero = numero;
		this.numeroLargo = numeroLargo;
		this.numeroFlotante = numeroFlotante;
		this.numeroExtenso = numeroExtenso;
	}

	/**
	 * @return the booleano
	 */
	public Boolean getBooleano() {
		return booleano;
	}

	/**
	 * @param booleano the booleano to set
	 */
	public void setBooleano(Boolean booleano) {
		this.booleano = booleano;
	}

	/**
	 * @return the bite
	 */
	public Byte getBite() {
		return bite;
	}

	/**
	 * @param bite the bite to set
	 */
	public void setBite(Byte bite) {
		this.bite = bite;
	}

	/**
	 * @return the caracter
	 */
	public Character getCaracter() {
		return caracter;
	}

	/**
	 * @param caracter the caracter to set
	 */
	public void setCaracter(Character caracter) {
		this.caracter = caracter;
	}

	/**
	 * @return the numeroCorto
	 */
	public Short getNumeroCorto() {
		return numeroCorto;
	}

	/**
	 * @param numeroCorto the numeroCorto to set
	 */
	public void setNumeroCorto(Short numeroCorto) {
		this.numeroCorto = numeroCorto;
	}

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the numeroLargo
	 */
	public Long getNumeroLargo() {
		return numeroLargo;
	}

	/**
	 * @param numeroLargo the numeroLargo to set
	 */
	public void setNumeroLargo(Long numeroLargo) {
		this.numeroLargo = numeroLargo;
	}

	/**
	 * @return the numeroFlotante
	 */
	public Float getNumeroFlotante() {
		return numeroFlotante;
	}

	/**
	 * @param numeroFlotante the numeroFlotante to set
	 */
	public void setNumeroFlotante(Float numeroFlotante) {
		this.numeroFlotante = numeroFlotante;
	}

	/**
	 * @return the numeroExtenso
	 */
	public Double getNumeroExtenso() {
		return numeroExtenso;
	}

	/**
	 * @param numeroExtenso the numeroExtenso to set
	 */
	public void setNumeroExtenso(Double numeroExtenso) {
		this.numeroExtenso = numeroExtenso;
	}

	@Override
	public String toString() {
		return "TiposWrapper [booleano=" + booleano + ", bite=" + bite + ", caracter=" + caracter + ", numeroCorto="
				+ numeroCorto + ", numero=" + numero + ", numeroLargo=" + numeroLargo + ", numeroFlotante="
				+ numeroFlotante + ", numeroExtenso=" + numeroExtenso + "]";
	}

}
