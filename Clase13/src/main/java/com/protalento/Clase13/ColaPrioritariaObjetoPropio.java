package com.protalento.Clase13;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.protalento.entidad.Documento;
import com.protalento.entidad.Persona;

public class ColaPrioritariaObjetoPropio {
	public static void main(String[] args) throws InterruptedException {
		Comparator<Persona> ordenEdad = new Comparator<Persona>() {

			public int compare(Persona persona1, Persona persona2) {

				return persona1.getEdad() - persona2.getEdad();
			}

		};

		PriorityQueue<Persona> personas = new PriorityQueue<>(ordenEdad);
		personas.add(new Persona(new Documento("DNI", "01"), "Persona 01", 15));
		personas.add(new Persona(new Documento("DNI", "08"), "Persona 02", 18));

		personas.add(new Persona(new Documento("PAS", "01"), "Persona 03", 89));
		personas.add(new Persona(new Documento("CI", "16"), "Persona 04", 56));
		personas.add(new Persona(new Documento("DNI", "03"), "Persona 05", 75));

		while (!personas.isEmpty()) {
			System.out.println("Proximo en atender: " + personas.peek());
			Thread.sleep(2000);
			System.out.println("Atendiendo a: " + personas.poll());
			Thread.sleep(2000);
		}
		
		
		
		

	}
}
