package com.protalento.Clase10;

import com.protalento.entidades.Camisa;
import com.protalento.entidades.Generica;
import com.protalento.entidades.GenericaExtendida;
import com.protalento.entidades.Pantalon;
import com.protalento.entidades.Parametro;
import com.protalento.entidades.Producto;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Generica<String> generica1 = new Generica<String>("");

		generica1.setCampo1("Hola mundo desde un generico");

		System.out.println(generica1.getCampo1());

		Generica<Integer> generica2 = new Generica<Integer>(5);
		System.out.println(generica2.getCampo1());

		Pantalon pantalon = new Pantalon(new Parametro<Long, String>(1L, "Este es el QR"));

		System.out.println(pantalon);

		Parametro parametro = new Parametro();
		parametro.setCampo1("Fruta");
		parametro.setCampo2(new Camisa());

		Parametro<Camisa, Pantalon> parametro2 = new Parametro<>();
		Parametro<Pantalon, Camisa> parametro3 = new Parametro<>();
		Parametro<Pantalon, Camisa> parametro4 = new Parametro<>();
		parametro4 = parametro3;

		GenericaExtendida genericaExtendida = new GenericaExtendida<>();

	}
}
