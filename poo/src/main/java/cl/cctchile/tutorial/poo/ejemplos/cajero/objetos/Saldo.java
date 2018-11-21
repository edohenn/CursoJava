/**
 * Copyright 2018 cctchile , Todos los derechos reservados.
 */
package cl.cctchile.tutorial.poo.ejemplos.cajero.objetos;

/**
 * <p>
 * Manipula saldo cliente
 * </p>
 *
 * @author gerardo
 *
 */
public class Saldo {

	private int saldo;

	public Saldo(int saldo) {
		this.saldo = saldo;
	}

	public void depositar(int deposito) {
		if(deposito<=0) {
			System.out.println(String.format("SALDO --->  deposito invalido %d", deposito));
		}else {
			saldo += deposito;
		}		
	}

	public void girar(int giro) {
		if(giro > saldo) {
			System.out.println(String.format("SALDO --->  saldo insuficiente, valor: %d", saldo));
		}else {
			saldo -= giro;	
		}	
	}

	public void mostrarSaldo() {
		System.out.println(String.format("SALDO --->  saldo : %d", saldo));
	}
	
	
}
