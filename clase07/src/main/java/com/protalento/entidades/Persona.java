package com.protalento.entidades;

import java.time.LocalDate;

public abstract class Persona {
	private Documento documento;
	private String descripcion;
	private LocalDate fechaNacimiento;

	public Persona() {

	}

	public Persona(Documento documento, String descripcion, LocalDate fechaNacimiento) {
		super();
		this.documento = documento;
		this.descripcion = descripcion;
		this.fechaNacimiento = fechaNacimiento;
	}

	public void mostrarAtributos() {
		System.out.println(
				documento.getTipo() + "-" + documento.getNumero() + ": " + descripcion + " " + fechaNacimiento);
	}
	// guardar

	/**
	 * 
	 */
	public abstract void guardar();
	

	@Override
	public String toString() {
		return "Persona [documento=" + documento + ", descripcion=" + descripcion + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

	/**
	 * @return the documento
	 */
	public Documento getDocumento() {
		return documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
