package com.protalento.Clase20;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class PF_Reduce {
	public static void main(String[] args) {
		List<String> caracteres = Arrays.asList("H", "o", "l", "a");
		System.out.println(getCadena(caracteres));

		String cadena = caracteres.stream().reduce("T", (e1, e2) -> {
			System.out.println(e1);
			return e1.concat(" ").concat(e2);

		});
		System.out.println(cadena);

	}

	private static String getCadena(List<String> caracteres) {
		StringBuffer cadena = new StringBuffer();
		for (String caracter : caracteres) {
			cadena.append(caracter).append(" ");
		}
		return cadena.toString();
	}
}
