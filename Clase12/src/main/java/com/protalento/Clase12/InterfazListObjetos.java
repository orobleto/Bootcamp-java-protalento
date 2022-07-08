package com.protalento.Clase12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.protalento.entidades.Documento;
import com.protalento.entidades.Persona;

public class InterfazListObjetos {
	public static void main(String[] args) {
		List<Persona> personas = new LinkedList<>();
		personas.add(new Persona(new Documento("DNI", "03"), "Persona 01", 25));

		personas.add(new Persona(new Documento("CI", "15"), "Persona 03", 80));

		personas.add(new Persona(new Documento("CI", "09"), "Persona 03", 80));
		personas.add(new Persona(new Documento("DNI", "02"), "Persona 02", 18));
		personas.add(new Persona(new Documento("PAS", "03"), "Persona 04", 37));
		personas.add(new Persona(new Documento("PAS", "06"), "Persona 04", 37));
		personas.add(new Persona(new Documento("PAS", "01"), "Persona 04", 37));
		personas.add(new Persona(new Documento("CI", "04"), "Persona 03", 80));

		App.imprimirLista(personas);

		// personas.remove(new Persona(new Documento("DNI", "01"), "Persona 01", 25));

		Comparator<Persona> comparadorEdades = new Comparator<Persona>() {

			@Override
			public int compare(Persona persona1, Persona persona2) {
				// Negativo persona1 va primero
				// Positivo persona2 va primero
				// cero no se ordena
				return persona1.getEdad() - persona2.getEdad();
			}
		};

		personas.sort(comparadorEdades);

		App.imprimirLista(personas);

		Comparator<Persona> ordenDocumento1 = new Comparator<Persona>() {
			@Override
			public int compare(Persona persona1, Persona persona2) {
				// orden ascente de dos campos
				String documento1 = persona1.getDocumento().getTipo().concat(persona1.getDocumento().getNumero());
				String documento2 = persona2.getDocumento().getTipo().concat(persona2.getDocumento().getNumero());

				return documento1.compareTo(documento2);
			}

		};

		// personas.sort(ordenDocumento1);

		// App.imprimirLista(personas);
		// Ordenar por documento

		Comparator<Persona> ordenDocumento2 = new Comparator<Persona>() {

			// A B C C 01 C 08
			@Override
			public int compare(Persona persona1, Persona persona2) {

				// si los tipos de documentos son iguales
				if (persona1.getDocumento().getTipo().equals(persona2.getDocumento().getTipo())) {
					return persona1.getDocumento().getNumero().compareTo(persona2.getDocumento().getNumero());
				}

				return compararTipos(persona1.getDocumento().getTipo())
						- compararTipos(persona2.getDocumento().getTipo());
			}

			private int compararTipos(String tipo) {
				String[] orden = { "DNI", "PAS", "CI" };
				for (int i = 0; i < orden.length; i++) {
					if (orden[i].equalsIgnoreCase(tipo)) {
						return i;
					}
				}
				return orden.length;
			}

		};

		personas.sort(ordenDocumento2);
		App.imprimirLista(personas);

		// ORDENAR DNI , PAS , CI -- > 01 02 03

		// tipos de cuenta Caja de Ahorro / Cuentas Corrientes

		// dinamica
		List<Persona> listaPersonas = Arrays.asList(
				new Persona(new Documento("CI", "01"), "Persona 01", 80),
				new Persona(new Documento("CI", "02"), "Persona 02", 80),
				new Persona(new Documento("CI", "03"), "Persona 03", 80),
				new Persona(new Documento("CI", "04"), "Persona 04", 80)
		);
		
		App.imprimirLista(listaPersonas);
		
		listaPersonas.set(0, new Persona(new Documento("CI", "10"), "Persona 01", 80));
		
		App.imprimirLista(listaPersonas);
		
		listaPersonas.add(new Persona());

	}

}
