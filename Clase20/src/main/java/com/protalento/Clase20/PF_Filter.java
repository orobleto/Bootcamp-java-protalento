package com.protalento.Clase20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// implements Clonable clone();
public class PF_Filter {
// ->.->.->.->
	public static void main(String[] args) {

		List<String> nombres = Arrays.asList("Luis", "July", "Alexander", "Jose", "Jeison");
		List<String> nombresconJ = getSoloConJ(nombres);
		System.out.println(nombres);
		System.out.println(nombresconJ);

		// patron pipeline
		List<String> nombrescomienzaJLista = nombres.stream().filter(e -> e.startsWith("A") || e.startsWith("L"))
				.collect(Collectors.toList());
		System.out.println(nombrescomienzaJLista);
	}

	private static List<String> getSoloConJ(List<String> nombres) {
		List<String> nombresJ = new ArrayList<>();
		for (String nombre : nombres) {
			if (nombre.startsWith("J")) {
				nombresJ.add(nombre);
			}
		}
		return nombresJ;
	}

}
