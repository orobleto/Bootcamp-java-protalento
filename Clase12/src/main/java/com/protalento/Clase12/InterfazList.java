package com.protalento.Clase12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class InterfazList {
	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		nombres.add("Octavio");
		nombres.add("Rafael");
		nombres.add("Jose");
		nombres.add("Analia");
		nombres.add("Paola");

		ListIterator<String> it = nombres.listIterator();

		System.out.println("List Iterator Asc");
		while (it.hasNext()) {
			int indice = it.nextIndex();
			String nombre = it.next();
			System.out.println(nombre + "-->" + indice);
			if (nombre.endsWith("se")) {
				it.set("Mariana");
			}
		}

		System.out.println("List Iterator Desc");
		while (it.hasPrevious()) {
			int indice = it.previousIndex();
			String nombre = it.previous();
			System.out.println(nombre + "-->" + indice);
		}

		// hasNext . next remove

		App.imprimirLista(nombres);

		nombres.add(2, "Maria");

		App.imprimirLista(nombres);

		nombres.set(0, "Fredy");

		App.imprimirLista(nombres);

		nombres.remove(1);

		App.imprimirLista(nombres);

		nombres.remove("Fredy");

		App.imprimirLista(nombres);

		for (int i = 0; i < nombres.size(); i++) {
			String nombre = nombres.get(i);
			if (nombre.startsWith("An")) {
				nombres.remove(nombre);
			}
		}

		App.imprimirLista(nombres);

		List<String> nombres2 = nombres.subList(1, 3);
		System.out.println(nombres2);

	}

}
