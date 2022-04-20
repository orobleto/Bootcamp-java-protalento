package com.protalento.entidades;

import java.time.LocalDate;

public class Moderadora extends Empleado {
	private String area;

	public Moderadora() {
		super();
	}

	public Moderadora(Documento documento, String descripcion, LocalDate fechaNacimiento, Float sueldo, String area) {
		super(documento, descripcion, fechaNacimiento, sueldo);
		this.area = area;
	}

	@Override
	public String toString() {
		return "Moderadora [" + super.toString() + ", " + area + "]";
	}

	@Override
	public void guardar() {
		System.out.println("guardadno moderadora");

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
	public boolean eliminar() {
		return true;
	}

	@Override
	public void imprimirFisco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirPDF(String directorio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean actualizar() {
		// TODO Auto-generated method stub
		return true;
	}

}
