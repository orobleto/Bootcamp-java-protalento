package com.protalento.entidades;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Usuario {
	private Integer id;
	private String correo;
	private String clave;
	private LocalDate fechaCreacion;
	private static AtomicInteger contador = new AtomicInteger(1);

	public Usuario() {
		super();
		this.id = contador.getAndIncrement();
	}

	public Usuario(String correo, String clave, LocalDate fechaCreacion) {
		super();
		this.id = contador.getAndIncrement();
		this.correo = correo;
		this.clave = clave;
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", correo=" + correo + ", clave=" + clave + ", fechaCreacion=" + fechaCreacion
				+ "]";
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
	 * @return the fechaCreacion
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
