package com.protalento.Clase02;

public class Operadorternario {
	public static void main(String[] args) {
		//
		String mensaje;
		byte edad = 20;

		if (edad > 17)
			mensaje = "mayor";
		else
			mensaje = "menor";

		System.out.println(mensaje);

		// condicion ? cumple : no cumple
		mensaje = edad > 17 ? "Es Mayor" : "Es Menor";
		System.out.println(mensaje);

		byte mayor = (byte) (edad > 17 ? 1 : 0);

		System.out.println(mayor);

		System.out.println(edad < 18 ? "Es menor de edad" : "Es mayor de edad");

		boolean esMayor = edad > 17;

		System.out.println(esMayor);

		System.out.println(esMayor ? "MAYOR" : "MENOR");

		System.out.println(edad > 17 ? (edad > 35 ? "adilto2" : "adulto1") : "Menor");

	}
}
