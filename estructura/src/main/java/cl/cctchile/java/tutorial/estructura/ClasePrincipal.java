/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.estructura;

import cl.cctchile.java.tutorial.estructura.ejemplos.Cuadrado;
import cl.cctchile.java.tutorial.estructura.ejemplos.Forma;
import cl.cctchile.java.tutorial.estructura.ejemplos.Rectangulo;

/**
 * <p>Clase de ejecucion de ejemplos</p>
 * @author gerardo.garrido
 *
 */
public class ClasePrincipal {
	
	/**
	 * Metodo main recibe argumentos desde consola.
	 * EJ: java ClasePrincipal param1 param2 ...
	 * @param args
	 */
	public static void main(String[] args) {

		Forma rectangulo = new Rectangulo(3, 5);
		Forma cuadrado = new Cuadrado(3);

		System.out.println(
				String.format("El area del cuadrado es %d y el perimetro es %d", 
						cuadrado.area(),
						cuadrado.perimetro()));
		System.out.println(
				String.format("El area del rectangulo es %d y el perimetro es %d", 
						rectangulo.area(),
						rectangulo.perimetro()));

	}
}
