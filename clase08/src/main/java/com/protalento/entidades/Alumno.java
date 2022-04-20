package com.protalento.entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class Alumno extends Persona {
	private Curso[] cursos;

	public Alumno() {
		super();
	}

	public Alumno(Documento documento, String descripcion, LocalDate fechaNacimiento, Curso[] cursos) {
		super(documento, descripcion, fechaNacimiento);
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Alumno [" + super.toString() + ", " + Arrays.toString(cursos) + "]";
	}

	@Override
	public void guardar() {
		System.out.println("guardando alumno");
	}

	/**
	 * @return the cursos
	 */
	public Curso[] getCursos() {
		return cursos;
	}

	/**
	 * @param cursos the cursos to set
	 */
	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}

	@Override
	public boolean eliminar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void imprimirFisco() {

	}

	@Override
	public void imprimirPDF(String directorio) {

	}

	@Override
	public boolean actualizar() {

		return true;
	}

}
