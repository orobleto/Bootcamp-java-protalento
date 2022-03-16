package com.protalento.Clase02;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("inicio");
		byte edad = 15;
		// byte cantidadPersonas = 5;

		// menores de edad, adultos entre 18 y 35 adultos2 > 35 adulto3 >60

		if (edad > 60) {
			System.out.println("adulto3");
		} else if (edad > 35) {
			System.out.println("adulto2");
		} else if (edad > 18) {
			System.out.println("adulto1");
		} else {
			System.out.println("menor");
		}

		if (edad > 17) {
			if (edad > 35) {
				if (edad > 60) {
					System.out.println("Adulto3");
				} else {
					System.out.println("Adulto2");
				}
			} else {
				System.out.println("Adulto1");
			}
		} else {
			System.out.println("Menor");
		}

		System.out.println("fin");
	}
}
