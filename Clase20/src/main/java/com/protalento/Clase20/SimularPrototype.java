package com.protalento.Clase20;

import java.time.LocalDate;

import com.protalento.entidades.Usuario;

public class SimularPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		Usuario usuario1 = new Usuario("user1", 1234, true, LocalDate.parse("2020-01-01"));
		Usuario usuario2 = usuario1.clone();

		System.out.println(usuario1);
		System.out.println(usuario2);

		System.out.println(usuario1 == usuario2);

		usuario2.setCorreo("user2");

		System.out.println(usuario1);
		System.out.println(usuario2);
	}
}
