package com.protalento.Clase11;

import java.util.HashSet;
import java.util.Set;

import com.protalento.entidades.Cliente;

public class ImplementacionHashSetObjetosPropios {

	public static void main(String[] args) {
		Set<Cliente> clientes = new HashSet<>();
		clientes.add(new Cliente("01", "Cliente 01", (byte) 35));
		clientes.add(new Cliente("02", "Cliente 02", (byte) 18));
		clientes.add(new Cliente("03", "Cliente 03", (byte) 28));
		ImplementacionHashSet.imprimir(clientes);
		clientes.add(new Cliente("03", "Cliente 03", (byte) 28));

		ImplementacionHashSet.imprimir(clientes);

	}

}
