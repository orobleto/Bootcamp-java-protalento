package com.protalento.Clase04;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// declarar un arreglo "constante"
		String[] diasSemana = { "Lun", "Mar", "Mie", "Jue", "Vie", "Sab", "Dom" };// 0
		String meses[] = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };

		byte[] edades;
		// pedimos por consola
		edades = new byte[2]; // 0 1 y 2
		byte diaSemana;
		diaSemana = 5;

		edades[1] = 25;
		edades[0] = 16;
		// edades[2] = 39;

		System.out.println(edades[0]);
		System.out.println(edades[1]);
		// System.out.println(edades[2]);

		System.out.println(Arrays.toString(edades));

		// la forma de recorrer un arreglo es con for
		System.out.println("*****************************");

		int longitudEdades = edades.length;
		String cadena = "hola mundo";
		int longitudCadena = cadena.length();

		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]);
		}

	}
}
