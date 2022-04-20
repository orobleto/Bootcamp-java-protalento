package com.protalento.Clase09;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Inicio");

		try {

			String[] nombres = { "octavio", "Rafael" };
			nombres[1] = "";

			System.out.println(1 / 1);

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e.getMessage() + " " + e.getClass());
			System.out.println("Problemas generales");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage() + " " + e.getClass());
			System.out.println("No puedes dividir por cero");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " " + e.getClass());
			System.out.println("error Inesperado");
		} finally {
			System.out.println("Cerrar recursos");
		}

		System.out.println("Final");

		/*
		 * 
		 * try // trata
		 * 
		 * 
		 * 
		 * catch // captura
		 * 
		 * 
		 * 
		 * 
		 * finally // haz lo siguiente
		 */
	}
}
