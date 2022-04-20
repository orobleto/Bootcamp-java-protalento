package com.protalento.entidades;

import java.time.LocalDate;

public class Profesor extends Empleado {
	private String[] cursos;

	public Profesor() {

	}

	public Profesor(String[] cursos) {
		super();
		this.cursos = cursos;
	}

	public Profesor(Documento documento, String descripcion, LocalDate fechaNacimiento, LocalDate fechaIngreso,
			float sueldo, String[] cursos) {
		super(documento, descripcion, fechaNacimiento, fechaIngreso, sueldo);
		this.cursos = cursos;
	}

	/**
	 * @return the cursos
	 */
	public String[] getCursos() {
		return cursos;
	}

	/**
	 * @param cursos the cursos to set
	 */
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	public void guardar() {
		System.out.println("guardar");

	}

}
