package com.protalento.Clase11;

import java.util.LinkedHashSet;
import java.util.Set;

public class ImplementacionLinkedHashSet {
	public static void main(String[] args) {
		Set<Integer> numeros = new LinkedHashSet<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(4);
		numeros.add(3);
		numeros.add(4);
		ImplementacionHashSet.imprimir(numeros);

	}
}
