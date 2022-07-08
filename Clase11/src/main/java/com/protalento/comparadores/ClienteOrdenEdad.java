package com.protalento.comparadores;

import java.util.Comparator;

import com.protalento.entidades.Cliente;

public class ClienteOrdenEdad implements Comparator<Cliente> {

	@Override
	public int compare(Cliente cliente1, Cliente cliente2) {

		return cliente2.getEdad() - cliente1.getEdad();
	}

}
