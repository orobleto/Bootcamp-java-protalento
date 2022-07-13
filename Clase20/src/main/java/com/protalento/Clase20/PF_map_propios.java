package com.protalento.Clase20;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.protalento.entidades.Usuario;

public class PF_map_propios {
	public static void main(String[] args) {
		List<Usuario> usuarios = Arrays.asList(new Usuario("user1", 1234, true, LocalDate.parse("2020-01-01")),
				new Usuario("user2", 4567, false, LocalDate.parse("2020-02-01")),
				new Usuario("user3", 8901, true, LocalDate.parse("1986-01-03")),
				new Usuario("user4", 35432, false, LocalDate.parse("2022-01-01")),
				new Usuario("user5", 64, true, LocalDate.parse("2020-03-01")),
				new Usuario("user6", 65465, true, LocalDate.parse("2014-01-01")),
				new Usuario("user7", 3216, false, LocalDate.parse("1996-07-01")),
				new Usuario("user8", 85525, true, LocalDate.parse("2020-01-09")),
				new Usuario("user9", 888, true, LocalDate.parse("2020-01-31")),
				new Usuario("user10", 771, true, LocalDate.parse("1983-01-01")));

		List<String> correos = usuarios.stream().map(u -> u.getCorreo().toUpperCase()).collect(Collectors.toList());

		System.out.println(correos);
		System.out.println(usuarios);

		List<Usuario> usuarios2 = usuarios.stream().map(u -> {
			String correoActual = u.getCorreo().toUpperCase();
			u.setCorreo(correoActual.toUpperCase());
			return u;

		}).collect(Collectors.toList());
		System.out.println(usuarios2);

	}
}
