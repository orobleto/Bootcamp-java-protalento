package com.protalento.entidades;

public final class Documento extends Object {
	private String tipo;
	private String numero; // documento = DNI

	public Documento() {

	}

	public Documento(String tipo, String numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	
	
	@Override
	public String toString() {
		return "Documento [tipo=" + tipo + ", numero=" + numero + "]";
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
