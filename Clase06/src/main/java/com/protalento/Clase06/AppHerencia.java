package com.protalento.Clase06;

import java.text.ParseException;
import java.util.Date;

import com.protalento.entidades.Documento;
import com.protalento.entidades.Empleado;
import com.protalento.entidades.Moderador;
import com.protalento.entidades.Profesor;
import com.protalento.entidades.UtilidadesFecha;

public class AppHerencia {
	public static void main(String[] args) throws ParseException {
		Empleado empleado1 = new Empleado();
		empleado1.setDocumento(new Documento("DNI", "01"));
		empleado1.setDescripcion("Octavio");
		empleado1.setFechaNacimiento(UtilidadesFecha.getDateString("01/01/2022"));
		empleado1.setSueldo(26f);

		Profesor profesor = new Profesor();
		profesor.setDocumento(new Documento("DNI", "02"));
		profesor.setDescripcion("Analia");
		profesor.setFechaNacimiento(new Date());
		profesor.setCursos(new String[] { "Java" });
		profesor.setSueldo(25f);

		Moderador moderador = new Moderador();

		moderador.setSueldo(85.6f);

		System.out.println(empleado1.getSueldo());
		System.out.println(profesor.getSueldo());
		System.out.println(moderador.getSueldo());

	}
}
