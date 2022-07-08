package com.protalento.entidades;

import java.time.LocalDateTime;

public class Usuario {
	private Long id;
	private String correo;
	private String clave;
	private LocalDateTime fechaModificacion;

	public Usuario() {
		super();
	}

	public Usuario(Long id, String correo, String clave, LocalDateTime fechaModificacion) {
		super();
		this.id = id;
		this.correo = correo;
		this.clave = clave;
		this.fechaModificacion = fechaModificacion;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", correo=" + correo + ", clave=" + clave + ", fechaModificacion="
				+ fechaModificacion + "]";
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
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

	/**
	 * @return the fechaModificacion
	 */
	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

}
