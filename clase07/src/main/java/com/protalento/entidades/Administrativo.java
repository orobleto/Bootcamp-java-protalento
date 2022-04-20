package com.protalento.entidades;

public class Administrativo extends Empleado {
	String area;

	public Administrativo() {
		// TODO Auto-generated constructor stub
	}

	public Administrativo(String area) {
		super();
		this.area = area;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public void guardar() {
		System.out.println("guardar Administrativo");

	}

}
