package com.protalento.Clase13;

import java.util.LinkedList;

public class Colas {
	public static void main(String[] args) throws InterruptedException {

		long tiempo = 2000;
		LinkedList<String> colaNombres = new LinkedList<>();
		colaNombres.add("Octavio");
		colaNombres.add("Mariana");
		colaNombres.add("Fredy");
		colaNombres.add("Hector");
		colaNombres.add("Laura");
		
		System.out.println(colaNombres);

		while (!colaNombres.isEmpty()) {

			System.out.println("Proximo en Atender: " + colaNombres.peekLast());
			Thread.sleep(tiempo);

			System.out.println("Atendiendo a: " + colaNombres.pollLast());
			Thread.sleep(tiempo);
		}

	}
}
