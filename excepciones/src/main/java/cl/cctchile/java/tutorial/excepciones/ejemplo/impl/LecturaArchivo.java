/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.java.tutorial.excepciones.ejemplo.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import cl.cctchile.java.tutorial.excepciones.ejemplo.ILecturaArchivo;

/**
 * <p>
 * Esta clase gatilla un error de archivo no encontrado.
 * </p>
 *
 * @author gerardo
 *
 */
public class LecturaArchivo implements ILecturaArchivo {

	@Override
	public void leerArchivo() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("miarchivo.txt");
			fis.toString();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		}finally{
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
