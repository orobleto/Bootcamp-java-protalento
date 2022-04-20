package com.protalento.entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class Profesor extends Empleado {
	private Curso[] cursos;

	public Profesor() {
		super();
	}

	public Profesor(Documento documento, String descripcion, LocalDate fechaNacimiento, Float sueldo, Curso[] cursos) {
		super(documento, descripcion, fechaNacimiento, sueldo);
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Profesor [" + getDocumento() + ", " + getDescripcion() + ", " + getFechaNacimiento() + "," + getActivo()
				+ ", " + getSueldo() + ", " + Arrays.toString(cursos) + "]";
	}

	@Override
	public void guardar() {
		System.out.println("Guardando profesor");

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
