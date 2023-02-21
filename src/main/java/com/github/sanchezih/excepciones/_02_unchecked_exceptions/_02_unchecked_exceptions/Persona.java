package com.github.sanchezih.excepciones._02_unchecked_exceptions._02_unchecked_exceptions;

public class Persona {

	private int edad;

	public Persona(int edad) {
		setEdad(edad);
	}

	private void setEdad(int edad) /* throws IllegalArgumentException */ {
		try {
			Verificador.checkEsNegativo(edad);
			this.edad = edad;
		} catch (RuntimeException ex) {
			throw new IllegalArgumentException("La edad debe ser positiva", ex);
		}
	}
}