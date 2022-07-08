package com.protalento.Clase16;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String clave;

	public Usuario() {

	}

	public Usuario(Integer id, String clave) {
		super();
		this.id = id;
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", clave=" + clave + "]";
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

}
