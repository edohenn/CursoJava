/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.tutorial.poo.ejemplos.cajero.objetos;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * <p>
 * permite obtener datos
 * </p>
 *
 * @author gerardo
 *
 */
public class Lector {

	private Scanner entrada;

	public Lector() {
		entrada = new Scanner(System.in);
	}

	public TipoOperacion solicitarOpcion() {
		System.out.println("--- ingrese opcion del 1 al 4 ---");
		int operacionId = entrada.nextInt();
		try {
			return Arrays.stream(TipoOperacion.values())
					.filter(tipoOperacion -> operacionId == tipoOperacion.getOperacionId())
					.findFirst()
					.get();
		} catch (NoSuchElementException e) {
			return TipoOperacion.INVALIDA;
		}
	}

	public int solicitarMonto() {
		System.out.println("--- ingrese monto ---");
		return entrada.nextInt();
	}
	
	public static void main(String[] args) {
		Lector lector = new Lector();
		System.out.println(lector.solicitarMonto());
		System.out.println(lector.solicitarOpcion());
		
	}

}
