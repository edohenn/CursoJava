/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.excepciones.ejemplo.impl;

import cl.cctchile.java.tutorial.excepciones.ejemplo.ICustomExceptionTest;
import cl.cctchile.java.tutorial.excepciones.ejemplo.custom.CustomException;

/**
 * <p>Implemeta salidas excepcion</p>
 *
 * @author gerardo
 *
 */
public class CustomExceptionTest implements ICustomExceptionTest {

	@Override
	public void ejecutar() throws CustomException {
		int numerador = 1;
		int denominador = 0;
		try {
			float resultado = numerador / denominador;
			System.out.println(String.format("Resultado es %f",resultado));
		}catch (ArithmeticException e) {
			throw new CustomException();
		}
				
	}

}
