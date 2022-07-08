package com.protalento.entidades;

import java.util.Objects;

public class Cliente implements Comparable<Cliente> { // yo soy del mismo tipo contra el que voy a ordenar

	private String documento;
	private String descripion;
	private Byte edad;

	public Cliente() {

	}

	public Cliente(String documento, String descripion, Byte edad) {
		super();
		this.documento = documento;
		this.descripion = descripion;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [documento=" + documento + ", descripion=" + descripion + ", edad=" + edad + "]";
	}

	/**
	 * @return the edad
	 */
	public Byte getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Byte edad) {
		this.edad = edad;
	}

	/**
	 * @return the documento
	 */

	public String getDocumento() {
		return documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	/**
	 * @return the descripion
	 */
	public String getDescripion() {
		return descripion;
	}

	/**
	 * @param descripion the descripion to set
	 */
	public void setDescripion(String descripion) {
		this.descripion = descripion;
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
		Cliente other = (Cliente) obj;
		return Objects.equals(documento, other.documento);
	}

	@Override
	public int compareTo(Cliente cliente) {
		// negativo primero yo y positivo despues yo

		// return this.documento.compareTo(cliente.documento);// asc A-Z
		return this.documento.compareTo(cliente.documento);
	}

}
