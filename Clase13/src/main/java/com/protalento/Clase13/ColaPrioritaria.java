package com.protalento.Clase13;

import java.util.PriorityQueue;
import java.util.Queue;

public class ColaPrioritaria {
	public static void main(String[] args) throws InterruptedException {
		Queue<String> colaNombres = new PriorityQueue<>();
		colaNombres.add("Octavio");
		colaNombres.add("Mariana");
		colaNombres.add("Fredy");
		colaNombres.add("Hector");
		colaNombres.add("Laura");

		while (!colaNombres.isEmpty()) {

			System.out.println("Proximo en atender: " + colaNombres.peek());

			Thread.sleep(2000);

			System.out.println("Atendiendo a :" + colaNombres.poll());

			Thread.sleep(2000);
		}

	}
}
