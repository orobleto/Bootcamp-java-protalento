package com.protalento.Clase20;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.protalento.entidades.Usuario;

public class PF_Comparadores {
	public static void main(String[] args) {
		List<Usuario> usuarios = Arrays.asList(new Usuario("user1", 1234, true, LocalDate.parse("2020-01-01")),
				new Usuario("user1", 4567, false, LocalDate.parse("2020-02-01")),
				new Usuario("user3", 8901, true, LocalDate.parse("1986-01-03")),
				new Usuario("user3", 35432, false, LocalDate.parse("2022-01-01")),
				new Usuario("user5", 64, true, LocalDate.parse("2020-03-01")),
				new Usuario("user6", 65465, true, LocalDate.parse("2014-01-01")),
				new Usuario("user6", 3216, false, LocalDate.parse("1996-07-01")),
				new Usuario("user8", 85525, true, LocalDate.parse("2020-01-09")),
				new Usuario("user9", 888, true, LocalDate.parse("2020-01-31")),
				new Usuario("user9", 771, true, LocalDate.parse("1983-01-01")));

		// comparadores

		usuarios.forEach(e -> System.out.println(e));

		usuarios.sort((e1, e2) -> e1.getClave() - e2.getClave());
		System.out.println("***********************************************");
		usuarios.forEach(System.out::println);

		Comparator<Usuario> comparadorCorreo = (e1, e2) -> e2.getCorreo().compareTo(e1.getCorreo());
		Comparator<Usuario> comparatorClave = (e1, e2) -> e2.getClave() - e1.getClave();

		usuarios.sort(comparadorCorreo);

		System.out.println("***********************************************");
		usuarios.forEach(System.out::println);

		usuarios.sort(comparadorCorreo.reversed().thenComparing(comparatorClave.reversed()));

		System.out.println("***********************************************");
		usuarios.forEach(System.out::println);

		usuarios.sort(Usuario::ordenFechaCreacion);// ordenFechaCreacion(usuario)

		System.out.println("***********************************************");
		usuarios.forEach(System.out::println);

		usuarios.forEach(e -> System.out.println(e));

		usuarios.forEach(PF_Comparadores::imprimirUsuario);

		Collections.sort(usuarios, comparadorCorreo);

		System.out.println("***********************************************");
		usuarios.forEach(PF_Comparadores::imprimirUsuario);

	}

	private static void imprimirUsuario(Usuario usuario) {
		System.out.println(usuario.getCorreo() + " | " + usuario.getFechacreacion());
	}

	// metodo que devuelve un int
	// e1,e2
}
