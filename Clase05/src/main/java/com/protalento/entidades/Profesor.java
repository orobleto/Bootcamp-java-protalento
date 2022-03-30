package com.protalento.entidades;

public class Profesor {
	protected String descripcion;

	Profesor(String descripcion) {
		this.descripcion = descripcion;
	}
	// constructor protceted / public default private singleton

	public Profesor() {

	}

	public void mostrarAtributos() {
		System.out.println(convertirMayusculas(descripcion));
	}

	private String convertirMayusculas(String valor) {
		return valor.toUpperCase();
	}

	protected char inicial() {
		return descripcion.charAt(0);
	}
	
	
	public static void main(String[] args) {
		Profesor profesor =  new Profesor();
		profesor.inicial();
	}

}
