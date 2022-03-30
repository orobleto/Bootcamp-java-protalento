package com.protalento.entidades;

import java.time.LocalDate;
import java.util.Date;

public class Persona {
	// documento, descripcion, fechas () RIF 30-000000000-2

	// miembros de instancia
	private Documento documentoPersona;
	private String descripcion;
	private Date fechaNacimiento;
	private LocalDate fechaDeGraduacion;
	public static String ORIGEN = "HOMOSAPIENS";

	// getter
	public Documento getDocumentoPersona() {
		return documentoPersona;
	}

	public void setDocumentoPersona(Documento documentoPersona) {
		this.documentoPersona = documentoPersona;
	}

	public String getAtributos() {
		return descripcion + " " + UtilidadesFecha.getStringDate(fechaNacimiento) + " " + fechaDeGraduacion;
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
		if (descripcion.isBlank() || descripcion.isEmpty()) {
			System.out.println("ERROR NO DEBE IR VACIA LA DESCRIPCION");
		}

		this.descripcion = descripcion;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the fechaDeGraduacion
	 */
	public LocalDate getFechaDeGraduacion() {
		return fechaDeGraduacion;
	}

	/**
	 * @param fechaDeGraduacion the fechaDeGraduacion to set
	 */
	public void setFechaDeGraduacion(LocalDate fechaDeGraduacion) {
		this.fechaDeGraduacion = fechaDeGraduacion;
	}

}
