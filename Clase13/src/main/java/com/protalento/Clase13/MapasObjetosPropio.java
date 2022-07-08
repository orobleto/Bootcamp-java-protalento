package com.protalento.Clase13;

import java.util.HashMap;
import java.util.Map;

import com.protalento.entidad.Documento;
import com.protalento.entidad.Persona;

public class MapasObjetosPropio {
	public static void main(String[] args) {
		Map<Documento, Persona> personas = new HashMap<>();

		personas.put(new Documento("DNI", "01"), new Persona(new Documento("DNI", "01"), "Persona 01", 18));
		personas.put(new Documento("DNI", "02"), new Persona(new Documento("DNI", "02"), "Persona 02", 18));
		personas.put(new Documento("DNI", "03"), new Persona(new Documento("DNI", "03"), "Persona 03", 18));
		personas.put(new Documento("DNI", "04"), new Persona(new Documento("DNI", "04"), "Persona 04", 18));
		personas.put(new Documento("DNI", "01"), new Persona(new Documento("DNI", "01"), "Persona 05", 18));

		System.out.println(personas);

		System.out.println(personas.get(new Documento("DNI", "01")));

		for (Map.Entry<Documento, Persona> persona : personas.entrySet()) {
			System.out.println(persona.getKey() + " --> " + persona.getValue());
		}
		
		
		

	}
}
