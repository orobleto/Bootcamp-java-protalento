package com.protalento.entidades;

import java.time.LocalDate;

import com.protalento.interfaces.BaseDeDatos;
import com.protalento.interfaces.Impresora;
import com.protalento.utilidades.Fechas;

public abstract class Persona implements BaseDeDatos, Impresora {
	private Documento documento;
	private String descripcion;
	private LocalDate fechaNacimiento;
	private Boolean activo;

	public Persona() {
		super();
	}

	public Persona(Documento documento, String descripcion, LocalDate fechaNacimiento) {
		super();
		this.documento = documento;
		this.descripcion = descripcion;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [" + documento + ", " + descripcion + ", " + Fechas.getStringLocalDate(fechaNacimiento) + ", "
				+ (!activo? "Inactivo" : "Activo") + "]";
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

	/**
	 * @return the activo
	 */
	public Boolean getActivo() {
		return activo;
	}

	/**
	 * @param activo the activo to set
	 */
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

}
