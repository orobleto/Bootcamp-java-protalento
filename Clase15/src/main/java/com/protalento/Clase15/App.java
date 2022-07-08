package com.protalento.Clase15;

import java.time.LocalDateTime;

import com.protalento.entidades.Usuario;
import com.protalento.implementaciones.mariadb.UsuarioImplementacion;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Usuario usuario1;
		UsuarioImplementacion usuarioImplementacion = new UsuarioImplementacion();

		usuario1 = usuarioImplementacion.buscarPorId(1L);
		
		System.out.println(usuario1);	
		
		
		Usuario usuario2 =  new Usuario();
		usuario2.setCorreo("user3@gmail.com");
		usuario2.setClave("6666");
		usuario2.setFechaModificacion(LocalDateTime.now());
		
		System.out.println(usuario2);
		
		usuarioImplementacion.insertar(usuario2);
	
		System.out.println(usuario2);
		/*
		System.out.println(usuario1);
		System.out.println(usuarioImplementacion.modificar(usuario1));

		System.out.println(usuarioImplementacion.eliminar(usuario1));
		// System.out.println(usuarioImplementacion.insertar(new
		// Usuario("user3@gmail.com", "9516")));

		for (Usuario usuario : usuarioImplementacion.listar()) {
			System.out.println(usuario);
		}*/

	}
}
