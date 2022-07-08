package com.protalento.Clase19;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.protalento.entidades.Usuario;

public class AppEjercicioOrdenamiento {
	public static void main(String[] args) {

		List<Usuario> usuarios = Arrays.asList(new Usuario("user1", "ABCD1234", LocalDate.parse("1999-01-01")),
				new Usuario("user3", "zBCD1234", LocalDate.parse("2000-01-01")),
				new Usuario("user2", "hBCy1234", LocalDate.parse("1968-01-01")),
				new Usuario("user5", "yBCt1234", LocalDate.parse("1996-01-01")));

		System.out.println(usuarios);

		usuarios.sort(new OrdenarUsuarioClave());

		System.out.println(usuarios);

		usuarios.sort((u1, u2) -> u1.getCorreo().compareTo(u2.getCorreo()));

		System.out.println(usuarios);

	}
}

class OrdenarUsuarioClave implements Comparator<Usuario> {

	@Override
	public int compare(Usuario usuario1, Usuario usuario2) {

		return usuario1.getClave().compareTo(usuario2.getClave());
	}

}
