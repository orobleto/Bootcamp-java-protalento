package com.protalento.entidades;

public abstract class Producto {
	private String codigo;

	public Producto() {
		
	}
	
	public Producto(String codigo) {
		super();
		this.codigo = codigo;
	}

	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + "]";
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
