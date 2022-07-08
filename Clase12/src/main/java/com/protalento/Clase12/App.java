package com.protalento.Clase12;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

	}

	public static void imprimirLista(List lista) {
		System.out.println("********************");
		for (Object object : lista) {
			System.out.println(object);
		}
	}
}
