package com.protalento.Clase20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class PF_map {
	public static void main(String[] args) {
		// transformar la informacion o los objetos

		List<Integer> numeros = Arrays.asList(2, 5, 9, -8, 13, 15, 99, 80);
		System.out.println(numeros);

		List<Integer> dobles = getDoble(numeros);
		System.out.println(dobles);

		Stream<Integer> numerosStream = numeros.stream();

		List<Integer> doblesDesdestream = numerosStream.map(e -> e * 4).collect(Collectors.toList());
		System.out.println(doblesDesdestream);

		// cada elemento venga concatenado al principio con + y al final con un -

		// +2- +5- +-8-
		// T -> Integer
		List<Float> numerosflotantes = numeros.stream().map(e -> Float.valueOf("" + e)).collect(Collectors.toList());
		System.out.println(numeros);
		System.out.println(numerosflotantes);
	}

	// los elementos sean transformados a su doble
	private static List<Integer> getDoble(List<Integer> numeros) {
		List<Integer> dobleNumeros = new ArrayList<>();
		for (Integer numero : numeros) {
			dobleNumeros.add(numero * 2);
		}
		return dobleNumeros;
	}
}
