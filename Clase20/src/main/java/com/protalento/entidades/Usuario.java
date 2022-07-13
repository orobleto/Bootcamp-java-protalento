package com.protalento.entidades;

import java.time.LocalDate;

public class Usuario implements Cloneable {
	private String correo;
	private Integer clave;
	private Boolean activo;
	private LocalDate fechacreacion;

	public Usuario() {
		super();
	}

	public Usuario(String correo, Integer clave, Boolean activo, LocalDate fechacreacion) {
		super();
		this.correo = correo;
		this.clave = clave;
		this.activo = activo;
		this.fechacreacion = fechacreacion;
	}

	@Override
	public String toString() {
		return "Usuario [correo=" + correo + ", clave=" + clave + ", activo=" + activo + ", fechacreacion="
				+ fechacreacion + "]";
	}

	public Usuario clone() throws CloneNotSupportedException {
		return (Usuario) super.clone();
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
	public Integer getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(Integer clave) {
		this.clave = clave;
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

	/**
	 * @return the fechacreacion
	 */
	public LocalDate getFechacreacion() {
		return fechacreacion;
	}

	/**
	 * @param fechacreacion the fechacreacion to set
	 */
	public void setFechacreacion(LocalDate fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

}
