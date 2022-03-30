package com.protalento.Clase05;

import java.util.Scanner;

import com.protalento.entidades.Profesor;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		final int anioActual = 2022;
		Alumno alumno1;
		// instancias
		alumno1 = new Alumno();
		alumno1.descripcion = "Octavio Robleto";
		alumno1.tipoDocumento = "DNI";
		alumno1.numeroDocumento = "01";
		alumno1.edad = 39;
		alumno1.cursos = new String[] { "Java", "Python" };
		int anioNacimientoAlumno1 = alumno1.calcularanioNacimiento(2022, true);
		alumno1.imprimirEdad((byte) 80);

		System.out.println(anioNacimientoAlumno1);

		Alumno alumno2 = new Alumno();
		alumno2.descripcion = "Mariana Bracho";
		alumno2.tipoDocumento = "DNI";
		alumno2.numeroDocumento = "02";
		alumno2.edad = 32;
		alumno2.cursos = new String[] { "Scrum", "Base de Dayos" };
		System.out.println(alumno2.calcularanioNacimiento(anioActual, false));

		alumno1.mostrarAtributos();
		alumno2.mostrarAtributos();

		// System.out.println(Arrays.toString(alumno2.dameRangoNotas()));

		// Scanner teclado = new Scanner(null);
		final String documento= "DNI";
		Alumno alumno3 = new Alumno(documento, "03");
		alumno3.mostrarAtributos();
		
		
		Profesor profesor = new Profesor();
		profesor.mostrarAtributos();
		
		

	}
}
