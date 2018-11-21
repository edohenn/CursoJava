/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.tiposdedatos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author gerardo.garrido
 *
 */
public class ClasePrincipal {

	public static void main(String[] args) {
		ejemploCasteoDatosNativos();
		ejemploDatosWrapper();
		ejemploDatosString();
		ejemploDatosMatrices();
		ejemploManejoFechas();
	}

	private static void ejemploDatosMatrices() {
		int[][] matriz = { { 1, 2, 2, 2, 2, 3, 4 }, { 3, 2, 3, 3 }, { 3, 2 } };
		System.out.println(String.format("matriz size %d", matriz.length));

		for (int[] index : matriz) {
			System.out.println(String.format("sub matriz size %d", index.length));
		}
	}

	private static void ejemploManejoFechas() {
		LocalDate fecha = LocalDate.now();
		LocalDate fechaFutura = fecha.plusMonths(10);
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(String.format("Valor fecha HOY %s y formateado %s", fecha, fecha.format(formatoFecha)));
		System.out.println(
				String.format("Valor fecha FUTURA %s y formateado %s", fechaFutura, fechaFutura.format(formatoFecha)));


		//------------------------
		Date fechaDate = new Date();
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(fechaDate);
		calendario.add(Calendar.DATE, 10);
		Date fechaDateFuturo = calendario.getTime();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
		
		System.out.println(
				String.format("Valor fecha HOY DATE %s y formateado %s", fechaDate, formato.format(fechaDate)));
		System.out.println(String.format("Valor fecha FUTURA DATE  %s y formateado %s", fechaDateFuturo,
				 formato.format(fechaDateFuturo)));


	}

	private static void ejemploDatosString() {
		String hola1 = "HOLA";
		String hola2 = " HOLA   ".trim();

		System.out.println(String.format("Valor '%s' == Valor '%s'", hola1, hola2));

		if (hola1 == hola2) {
			System.out.println("String son iguales desde ==");
		}

		if (hola1.equals(hola2)) {
			System.out.println("String son iguales desde equals");
		}
	}

	private static void ejemploDatosWrapper() {
		Long numero1 = (long) (10);
		if (numero1.equals(10)) {
			System.out.println("Numeros son iguales desde equals");
		}

		if (numero1 == 10) {
			System.out.println("Numeros son iguales desde ===");
		}
	}

	private static void ejemploCasteoDatosNativos() {
		byte bite = 127;
		short numerocorto = bite;
		System.out.println(String.format("numero corto es : %d", numerocorto));
		int numero = numerocorto;
		System.out.println(String.format("numero es : %d", numerocorto));
		long numeroLargo = numero;
		System.out.println(String.format("numero largo es : %d", numeroLargo));
		float numeroFloat = numeroLargo;
		System.out.println(String.format("numero float es : %f", numeroFloat));
		double numeroDouble = numeroFloat;
		System.out.println(String.format("numero double es : %f", numeroDouble));
	}

}
