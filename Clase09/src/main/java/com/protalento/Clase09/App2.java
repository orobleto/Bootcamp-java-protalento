package com.protalento.Clase09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App2 {
	public static void main(String[] args) {
		Date fecha;
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

		try {
			fecha = formato.parse("");
			System.out.println(formato.format(fecha));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("Fin del sistema");

	}
}
