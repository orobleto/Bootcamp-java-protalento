package com.protalento.entidades;

import java.time.LocalDate;

public abstract class Empleado extends Persona{
	private Float sueldo;
	// darle cuerpo a los metodos abstractos heredados

	public Empleado() {
		super();
	}

	public Empleado(Documento documento, String descripcion, LocalDate fechaNacimiento, Float sueldo) {
		super(documento, descripcion, fechaNacimiento);
		this.sueldo = sueldo;
	}

	/**
	 * @return the sueldo
	 */
	public Float getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(Float sueldo) {
		this.sueldo = sueldo;
	}

}
