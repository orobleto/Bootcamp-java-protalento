package com.protalento.Clase06;

import java.text.ParseException;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import com.protalento.entidades.Documento;
import com.protalento.entidades.Persona;
import com.protalento.entidades.UtilidadesFecha;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws ParseException {
		Persona persona1 = new Persona();
		persona1.setDocumentoPersona(new Documento("DNI", "01"));
		persona1.setDescripcion("Octavio Robleto");
		String fecha = JOptionPane
				.showInputDialog("Ingresa la fecha de nacimiento: (" + UtilidadesFecha.FORMATO_FECHA + ")");

		persona1.setFechaNacimiento(UtilidadesFecha.getDateString(fecha));
		persona1.setFechaDeGraduacion(LocalDate.parse("2011-08-11"));

		System.out.println(persona1.getAtributos());

	}

}
