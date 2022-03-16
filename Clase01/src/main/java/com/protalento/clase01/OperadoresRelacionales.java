package com.protalento.clase01;

import java.util.Scanner;


public class OperadoresRelacionales {
	public static void main(String[] args) {
		int edad1 = 15;
		int edad2 = 15;

		System.out.println(edad1 <= edad2);

		String nombre1 = new String("octavio");
		String nombre2 = new String("octavio");

		System.out.println(nombre1 == nombre2);

		System.out.println("Escribe tu nombre:");
		Scanner teclado = new Scanner(System.in);
		String nombreTeclado = teclado.next();
		System.out.println(nombre1.equals(nombreTeclado));
		
		String numero = String.valueOf(2); // "" +

	}
}
