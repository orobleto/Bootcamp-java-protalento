package com.protalento.entidades;

import java.util.Objects;

// Proyecto Lombok
public class Persona {
	private Documento documento;
	private String descripcion;
	private Integer edad;

	public Persona() {
		super();
	}

	public Persona(Documento documento, String descripcion, Integer edad) {
		super();
		this.documento = documento;
		this.descripcion = descripcion;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [" + documento + ", " + descripcion + ", " + edad + "]";
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
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(documento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(documento, other.documento);
	}

}
