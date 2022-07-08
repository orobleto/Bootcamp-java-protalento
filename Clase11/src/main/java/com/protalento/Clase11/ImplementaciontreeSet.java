package com.protalento.Clase11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.protalento.comparadores.ClienteOrdenEdad;
import com.protalento.entidades.Cliente;

public class ImplementaciontreeSet {
	public static void main(String[] args) {
		Set<String> nombres = new TreeSet<>();
		nombres.add("Octavio");
		nombres.add("Laura");
		nombres.add("Luis");
		nombres.add("July");
		nombres.add("Jose");

		ImplementacionHashSet.imprimir(nombres);

		Set<Integer> numeros = new TreeSet<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(4);
		numeros.add(3);
		numeros.add(4);
		numeros.add(-8);
		ImplementacionHashSet.imprimir(numeros);

		ClienteOrdenEdad ordenEdad = new ClienteOrdenEdad();

		ClienteOrdenDescripcion clienteOrdenDescripcion = new ClienteOrdenDescripcion();

		Comparator<Cliente> ordenDocumentoDesc = new Comparator<>() {

			@Override
			public int compare(Cliente o1, Cliente o2) {

				return o2.getDocumento().compareTo(o1.getDocumento());
			}

		};

		Set<Cliente> clientes = new TreeSet<>(new ClienteOrdenDescripcion());

		clientes.add(new Cliente("A", "A Cliente 01", (byte) 35));
		clientes.add(new Cliente("C", "B Cliente 02", (byte) 28));
		clientes.add(new Cliente("B", "C Cliente 03", (byte) 36));
		clientes.add(new Cliente("H", "C Cliente 03", (byte) 29));

		ImplementacionHashSet.imprimir(clientes);

	}
}

class ClienteOrdenDescripcion implements Comparator<Cliente> {

	@Override
	public int compare(Cliente cliente1, Cliente cliente2) {
		// TODO Auto-generated method stub
		return cliente2.getDescripion().compareTo(cliente1.getDescripion());
	}

}
