package com.protalento.clase07;

import java.time.LocalDate;

import com.protalento.entidades.Alumno;
import com.protalento.entidades.Documento;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Alumno alumno = new Alumno(new Documento("DNI", "01"), "Alumno 1", LocalDate.now(),
				new String[] { "Java", "MySql" });
		alumno.guardar();
	}
}
