package com.protalento.Clase09;

import java.util.Date;

public class App3 {
	public static void main(String[] args) throws Exception {
		System.out.println("Inicio");
		FechaPrueba fechaPrueba1 = new FechaPrueba("2020-03-15");

		FechaPrueba fechaPrueba = new FechaPrueba();
		fechaPrueba.setFecha("2020-03-15");
		fechaPrueba.setFecha(new Date(123, 0, 1));

		System.out.println("Fin");
	}
}
