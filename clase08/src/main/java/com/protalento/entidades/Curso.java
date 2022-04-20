package com.protalento.entidades;

import com.protalento.interfaces.BaseDeDatos;

public final class Curso implements BaseDeDatos {
	private Integer codigo;
	private String descripcion;

	public Curso() {
		super();
	}

	public Curso(Integer codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Curso [" + codigo + ", " + descripcion + "]";
	}

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	@Override
	public void guardar() {
		System.out.println("guardando curso");

	}

	@Override
	public boolean eliminar() {

		return true;
	}

	@Override
	public boolean actualizar() {
		// TODO Auto-generated method stub
		return true;
	}

}
