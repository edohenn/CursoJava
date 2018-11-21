/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.excepciones;

import cl.cctchile.java.tutorial.excepciones.ejemplo.ICustomExceptionTest;
import cl.cctchile.java.tutorial.excepciones.ejemplo.IForzarError;
import cl.cctchile.java.tutorial.excepciones.ejemplo.ILecturaArchivo;
import cl.cctchile.java.tutorial.excepciones.ejemplo.INullPointerEjemplo;
import cl.cctchile.java.tutorial.excepciones.ejemplo.custom.CustomException;
import cl.cctchile.java.tutorial.excepciones.ejemplo.impl.CustomExceptionTest;
import cl.cctchile.java.tutorial.excepciones.ejemplo.impl.ForzarError;
import cl.cctchile.java.tutorial.excepciones.ejemplo.impl.LecturaArchivo;
import cl.cctchile.java.tutorial.excepciones.ejemplo.impl.NullPointerEjemploManejado;

/**
 * <p>
 * Clase ejecutra para excepciones.
 * </p>
 *
 * @author gerardo
 *
 */
public class ClasePrincipal {

	public static void main(String[] args) {
		System.out.println("INICIO");
		probarExcepcionNullPointer();
		probarExcepcionCustom();
		probarExcepcionInputFile();
		probarExcepcionError();
//		System.out.println("FIN");
	}
	
	private static void probarExcepcionNullPointer() {
		INullPointerEjemplo nullPointerEjemplo = new NullPointerEjemploManejado();
		nullPointerEjemplo.ejecutar();
	}

	private static void probarExcepcionInputFile() {
		ILecturaArchivo lecturaArchivo = new LecturaArchivo();
		lecturaArchivo.leerArchivo();
	}

	private static void probarExcepcionError() {
		IForzarError forzarError = new ForzarError();
		try {
			forzarError.haciendoAlgoIndebido();
		}catch(InterruptedException e) {
			System.out.println("error");
		}catch (ClassCastException e) {
			System.out.println("me quede sin memoria");
		}
	}

	private static void probarExcepcionCustom() {
		ICustomExceptionTest customExceptionTest = new CustomExceptionTest();
		try {
			customExceptionTest.ejecutar();
		} catch (CustomException e) {
			System.out.println("esto es con error checkeable ");
		}
	}

}
