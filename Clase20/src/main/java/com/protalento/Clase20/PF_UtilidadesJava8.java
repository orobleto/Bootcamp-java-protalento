package com.protalento.Clase20;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PF_UtilidadesJava8 {
	public static void main(String[] args) {
		List<String> nombres = List.of("Octavio", "Rafael", "July", "Analia");

		System.out.println(nombres);

		Set<String> apellidos = Set.of("Ramirez", "Robleto", "Torres");

		System.out.println(apellidos);

		Map<Integer, String> correos = Map.of(1, "user1", 2, "user2", 3, "user3");

		System.out.println(correos);

		for (Entry<Integer, String> correo : correos.entrySet()) {
			System.out.println(correo.getKey() + "->" + correo.getValue());
		}
	}
}
