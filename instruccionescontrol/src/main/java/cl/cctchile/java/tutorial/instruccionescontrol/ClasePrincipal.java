/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.instruccionescontrol;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import cl.cctchile.java.tutorial.instruccionescontrol.ejemplos.Estados;

/**
 * <p>
 * Clase pricipal para manipulacion de instrucciones de control
 * </p>
 *
 * @author gerardo
 *
 */
public class ClasePrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ejemploSwitch();
		ejemploIf();
		ejemploLoopFor();
		ejemploLoopWhile();
		ejemploLoopDoWhile();
		ejemploLmbda();
	}

	private static void ejemploLmbda() {
		List<String> arreglo = Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
		List<String> dias = arreglo.stream()
				.filter(diaSemana -> ("Lunes".equals(diaSemana) || "Miercoles".equals(diaSemana)))
				.collect(Collectors.toList());
		dias.forEach(System.out::println);
	}

	private static void ejemploLoopWhile() {
		int numero = 1;

		while (numero <= 10) {
			System.out.println(String.format("numero ejemploLoopWhile %d", numero));
			numero++;
		}
	}

	private static void ejemploLoopDoWhile() {
		int numero = 1;
		do {
			System.out.println(String.format("numero ejemploLoopWhile %d", numero));
			numero++;
		} while (numero <= 10);
	}

	private static void ejemploLoopFor() {
		String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

		System.out.println("Los dias de la semana son:");
		for (String d : dias) {
			System.out.println(d);
		}

		System.out.println("Los dias de la semana con indice son:");
		for (int i = 1; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
	}

	private static void ejemploIf() {
		Estados estado = Estados.EN_PROCESO;
		if (Estados.EN_PROCESO.equals(estado)) {
			System.out.println("El estado IF es en proceso");
		} else if (Estados.TODO.equals(estado)) {
			System.out.println("El estado IF por hacer");
		} else if (Estados.TERMINADO.equals(estado)) {
			System.out.println("El estado IF es en proceso");
		}

	}

	private static void ejemploSwitch() {
		Estados estado = Estados.EN_PROCESO;
		switch (estado) {
		case EN_PROCESO:
			System.out.println("El estado es en proceso");
			break;
		case TODO:
			System.out.println("El estado por hacer");
			break;
		case TERMINADO:
			System.out.println("El estado es en proceso");
			break;
		default:
			break;
		}

	}
}
