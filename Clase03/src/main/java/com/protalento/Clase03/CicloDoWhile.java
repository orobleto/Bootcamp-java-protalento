package com.protalento.Clase03;

public class CicloDoWhile {
	public static void main(String[] args) {
		System.out.println("Inicio");
		int contador = 10;
		//
		do {
			System.out.println(contador);
			contador++;
		} while (contador < 10);

		System.err.println(contador);
		System.out.println("Fin");
	}
}
