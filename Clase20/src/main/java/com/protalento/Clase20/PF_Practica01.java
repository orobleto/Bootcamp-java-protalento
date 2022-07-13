package com.protalento.Clase20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PF_Practica01 {
	public static void main(String[] args) {
		List<Character> caracteres = Arrays.asList('H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o');

		// ListCaracteres->Stream->TransformarCadenaCaracteres
		String cadena = caracteres.stream().map(e -> e.toString().toUpperCase()).reduce("", (e1, e2) -> e1.concat(e2));
		System.out.println(cadena);

	}
}
