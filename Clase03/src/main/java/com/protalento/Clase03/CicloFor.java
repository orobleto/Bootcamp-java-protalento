package com.protalento.Clase03;

public class CicloFor {
	public static void main(String[] args) {
		System.out.println("Inicio FOR");
		int contador = 0;

		for (contador = 0; contador < 10; contador++) {
			// continue

			if (contador == 8) {
				continue;// la iteracion
			}

			if (contador == 8) {
				break;
			}
			// break;
			System.out.println(contador);
			// 98798798798
		}

		System.out.println("Fin FOR");

	}
}
