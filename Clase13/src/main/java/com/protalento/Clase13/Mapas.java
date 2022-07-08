package com.protalento.Clase13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Mapas {

	public static void main(String[] args) {
		Map<Integer, String> nombres = new HashMap<>();
		nombres.put(1, "Octavio");
		nombres.put(2, "Mariana");
		nombres.put(3, "Rafael");
		nombres.put(4, "Jose");
		nombres.put(5, "Laura");

		System.out.println(nombres);

		nombres.remove(2);
		System.out.println(nombres);

		nombres.put(5, "Maria");// actualizacion
		System.out.println(nombres);

		System.out.println(nombres.get(3));

		System.out.println(nombres.containsKey(3));

		System.out.println(nombres.containsValue("Jose"));

		System.out.println(nombres.values());

		System.out.println(nombres.keySet());

		// recorrer un mapa

		Iterator<Integer> it = nombres.keySet().iterator();

		while (it.hasNext()) {
			Integer clave = it.next();

			System.out.println("El objeto con la clave " + clave + " es: " + nombres.get(clave));
		}
		System.out.println("**********************");
		
		
		for (Entry<Integer, String> nombre : nombres.entrySet()) {
			System.out.println("Clave: " + nombre.getKey() + " Valor: " + nombre.getValue());
		}

	}
}
