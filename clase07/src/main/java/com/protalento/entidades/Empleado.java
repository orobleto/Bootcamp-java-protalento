package com.protalento.entidades;

import java.time.LocalDate;

public abstract class Empleado extends Persona {
	private LocalDate fechaIngreso;
	float sueldo;

	public Empleado() {

	}

	public Empleado(LocalDate fechaIngreso, float sueldo) {
		super();
		this.fechaIngreso = fechaIngreso;
		this.sueldo = sueldo;
	}

	public Empleado(Documento documento, String descripcion, LocalDate fechaNacimiento, LocalDate fechaIngreso,
			float sueldo) {
		super(documento, descripcion, fechaNacimiento);
		this.fechaIngreso = fechaIngreso;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [toString()=" + super.toString() + ", fechaIngreso=" + fechaIngreso + ", sueldo=" + sueldo
				+ "]";
	}

	public void mostrarAtributos() {
		System.out.println("sobreescrito");
	}

	/**
	 * @return the fechaIngreso
	 */
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return the sueldo
	 */
	public float getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}
