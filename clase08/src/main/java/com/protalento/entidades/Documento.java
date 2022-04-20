package com.protalento.entidades;

public final class Documento {
	private String tipo;
	private String numero;

	public Documento() {
		super();
	}

	public Documento(String tipo, String numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Documento [" + tipo + ", " + numero + "]";
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
