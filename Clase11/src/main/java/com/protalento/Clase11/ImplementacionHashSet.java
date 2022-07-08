package com.protalento.Clase11;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ImplementacionHashSet {

	public static void main(String[] args) {
		Set<String> nombres = new HashSet<>();
		nombres.add("Octavio");
		nombres.add("Laura");
		nombres.add("Luis");
		nombres.add("July");
		nombres.add("Jose");

		HashSet<String> apellidos = new HashSet<>();
		apellidos.add("Octavio");
		apellidos.add("Laura");
		apellidos.add("Luis");
		apellidos.add("July");
		apellidos.add("Jose");

		imprimir(nombres);
		for (String string : apellidos) {
			if (string.startsWith("O")) {
				nombres.remove(string);
			}
		}
		imprimir(nombres);

		AbstractSet<String> coleccion = new HashSet<>();
		coleccion.addAll(nombres);
		// coleccion.addAll(apellidos);

		/*
		 * System.out.println("Contienes a octavio? " + nombres.contains("Octavio"));
		 * System.out.println("Contienes la coleccion? " +
		 * nombres.containsAll(apellidos));
		 */

		imprimir(coleccion);

		nombres.add("Mariana");
		// coleccion.removeAll(nombres);

		imprimir(coleccion);

		nombres.clear();
		System.out.println(nombres.size());

		Iterator<String> iterator = coleccion.iterator();

		while (iterator.hasNext()) {
			String elemento = iterator.next();

			if (elemento.startsWith("O")) {
				iterator.remove();
			}
		}

		imprimir(coleccion);

		// imprimir(coleccion);
	}

	public static void imprimir(Set coleccion) {
		System.out.println("***************************");
		for (Object string : coleccion) {
			System.out.println(string);
		}
	}

}
