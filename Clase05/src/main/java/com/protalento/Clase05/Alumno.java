package com.protalento.Clase05;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Alumno {
	// primitivos u objetos
	String tipoDocumento;// pasaporte
	String numeroDocumento;// 95001001
	String descripcion;
	byte edad;
	String[] cursos;// n los que necesite mi clase

	Alumno() {
		// TODO Auto-generated constructor stub
	}

	// los que quiera y sean necesarios
	Alumno(String tipoDocumento, String numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	public Alumno(String tipoDocumento, String numeroDocumento, String descripcion, byte edad, String[] cursos) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.descripcion = descripcion;
		this.edad = edad;
		this.cursos = cursos;
	}

	void imprimirEdad(byte edad) {
		//
		if (this.edad != edad) {
			System.out.println("Las edades son diferentes");
		}
		System.out.println(edad);
	}

	// metodo de tipo procedimiento
	void mostrarAtributos() {
		String atributos = this.tipoDocumento + " " + numeroDocumento + " " + descripcion + " " + " " + edad + " "
				+ Arrays.toString(cursos); // concat

		JOptionPane.showMessageDialog(null, atributos);
	}

	// metodo de tipo funcion
	/*
	 * void calcularAnioNacimiento() { int anio = 2022 - edad;
	 * JOptionPane.showMessageDialog(null, "El año de nacimiento es: " + anio); }
	 */

	// cualquier tipo de dato (primitivo o un objeto)
	int calcularanioNacimiento(int anio, boolean ventana) {// 2022 2019
		if (ventana) {
			JOptionPane.showMessageDialog(null, "Ano de nacimiento: " + (anio - edad));
		}

		return anio - edad;
		// return 2022 - edad;
	}

	/*
	 * int[] dameRangoNotas() { return new int[] { 1, 10 }; }
	 */

}
