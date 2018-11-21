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
public class TiposArray {

	private int[] arreglo;
	private int[][] matriz;
	private int[][][] multidimencional;

	/**
	 * @param arreglo
	 * @param matriz
	 * @param multidimencional
	 */
	public TiposArray(int[] arreglo, int[][] matriz, int[][][] multidimencional) {
		super();
		this.arreglo = arreglo;
		this.matriz = matriz;
		this.multidimencional = multidimencional;
	}

	/**
	 * @return the arreglo
	 */
	public int[] getArreglo() {
		return arreglo;
	}

	/**
	 * @param arreglo the arreglo to set
	 */
	public void setArreglo(int[] arreglo) {
		this.arreglo = arreglo;
	}

	/**
	 * @return the matriz
	 */
	public int[][] getMatriz() {
		return matriz;
	}

	/**
	 * @param matriz the matriz to set
	 */
	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	/**
	 * @return the multidimencional
	 */
	public int[][][] getMultidimencional() {
		return multidimencional;
	}

	/**
	 * @param multidimencional the multidimencional to set
	 */
	public void setMultidimencional(int[][][] multidimencional) {
		this.multidimencional = multidimencional;
	}

}
