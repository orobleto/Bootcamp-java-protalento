package com.protalento.entidades;

public class Profesor extends Empleado {
	private String[] cursos;

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
	
	private void imprmir() {
		System.out.println(documento + " ");
	}
	
	
}
