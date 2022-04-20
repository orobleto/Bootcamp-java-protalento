package com.protalento.entidades;

import java.time.LocalDate;

public class Alumno extends Persona {
	String[] cursos;

	public Alumno(Documento documento, String descripcion, LocalDate fechaNacimiento, String[] cursos) {
		super(documento, descripcion, fechaNacimiento);
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

	@Override
	public void guardar() {
	System.out.println("guardar Alumno");
		
	}

}
