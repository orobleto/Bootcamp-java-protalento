package com.protalento.Clase03;

public class CalculoPrecioFinal {

	public static void main(String[] args) {

		// declarar las variables
		float precioInicial = 50f;
		float precioFinal = 0;
		float inflacion = 0.5f; // 0.005 15.75 0.1575
		float precioTope = 200;
		float inflacionAuxiliar = inflacion / 100;
		int cantidadMenses = 0;

		// precioFinal = precioInicial;

		/*
		 * for (precioFinal = precioInicial; precioFinal <= precioTope;
		 * cantidadMenses++) { precioFinal += (precioFinal * inflacionAuxiliar); }
		 */

		while (precioFinal <= precioTope) {
			float aumento = (precioFinal * inflacionAuxiliar);
			precioFinal += aumento;
			cantidadMenses++;
		}

		System.out.println(String.format("El producto paso de %.2f a %.2f", precioInicial, precioFinal) + " en "
				+ cantidadMenses + (cantidadMenses == 1 ? " mes" : " meses"));

	}

}
