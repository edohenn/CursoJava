/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.tiposdedatos.ejemplos;

/**
 * <p>
 * Los tipos primitivos son tipos de datos elementales de java y no se almacenan
 * en el stack.
 * </p>
 * 
 * @author gerardo.garrido
 *
 */
public class TiposNativos {

	// 8 bits, unsigned
	private boolean booleano;
	// 8 bits
	private byte bite;
	// 16 bits, unsigned
	private char caracter;
	// 16 bits
	private short numeroCorto;
	// 32 bits
	private int numero;
	// 64 bits
	private long numeroLargo;
	// 32 bits
	private float numeroFlotante;
	// 64 bits
	private double numeroExtenso;

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
	public TiposNativos(boolean booleano, byte bite, char caracter, short numeroCorto, int numero, long numeroLargo,
			float numeroFlotante, double numeroExtenso) {
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
	 * Ejemplos de como se castean los valores nativos
	 */
	public void casteandoValoresNativos() {

	}

	/**
	 * @return the booleano
	 */
	public boolean isBooleano() {
		return booleano;
	}

	/**
	 * @param booleano the booleano to set
	 */
	public void setBooleano(boolean booleano) {
		this.booleano = booleano;
	}

	/**
	 * @return the bite
	 */
	public byte getBite() {
		return bite;
	}

	/**
	 * @param bite the bite to set
	 */
	public void setBite(byte bite) {
		this.bite = bite;
	}

	/**
	 * @return the caracter
	 */
	public char getCaracter() {
		return caracter;
	}

	/**
	 * @param caracter the caracter to set
	 */
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}

	/**
	 * @return the numeroCorto
	 */
	public short getNumeroCorto() {
		return numeroCorto;
	}

	/**
	 * @param numeroCorto the numeroCorto to set
	 */
	public void setNumeroCorto(short numeroCorto) {
		this.numeroCorto = numeroCorto;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the numeroLargo
	 */
	public long getNumeroLargo() {
		return numeroLargo;
	}

	/**
	 * @param numeroLargo the numeroLargo to set
	 */
	public void setNumeroLargo(long numeroLargo) {
		this.numeroLargo = numeroLargo;
	}

	/**
	 * @return the numeroFlotante
	 */
	public float getNumeroFlotante() {
		return numeroFlotante;
	}

	/**
	 * @param numeroFlotante the numeroFlotante to set
	 */
	public void setNumeroFlotante(float numeroFlotante) {
		this.numeroFlotante = numeroFlotante;
	}

	/**
	 * @return the numeroExtenso
	 */
	public double getNumeroExtenso() {
		return numeroExtenso;
	}

	/**
	 * @param numeroExtenso the numeroExtenso to set
	 */
	public void setNumeroExtenso(double numeroExtenso) {
		this.numeroExtenso = numeroExtenso;
	}

	@Override
	public String toString() {
		return "TiposNativos [booleano=" + booleano + ", bite=" + bite + ", caracter=" + caracter + ", numeroCorto="
				+ numeroCorto + ", numero=" + numero + ", numeroLargo=" + numeroLargo + ", numeroFlotante="
				+ numeroFlotante + ", numeroExtenso=" + numeroExtenso + "]";
	}

}
