package com.protalento.Clase04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		// vamos a pedir notas
		// promedio de notas
		// declarar variables
		float[] notas;
		float promedio;
		int cantidadAlumnos;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingresa la cantidad de alumnos para asignarle notas: ");
		// aqui pido el dato
		cantidadAlumnos = teclado.nextInt();
		notas = new float[cantidadAlumnos];
		// notas = new float[teclado.nextInt()];

		// recorremos el arreglo para pedir las notas
		for (int i = 0; i < notas.length; i++) {

			do {
				System.out.print("Ingresa la nota " + (i + 1) + ": ");
				notas[i] = teclado.nextFloat();
				if (notas[i] < 0 || notas[i] > 5) {
					System.out.println("la nota debe estar comprendida entre 0 y 5");
					continue;
				}
				break;

			} while (true);

			/*
			 * System.out.print("Ingresa la nota " + (i + 1) + ": "); notas[i] =
			 * teclado.nextFloat();
			 * 
			 * if (notas[i] < 0 || notas[i] > 5) { i--; }
			 */

			// calcular el promedio sumar cada elemento
		}

		// calcular los datos
		promedio = 0;
		for (int i = 0; i < notas.length; i++) {
			promedio += notas[i];
		}

		// dividir entre la cantidad de elementos
		promedio /= notas.length; // cantidadAlumnos;
		System.out.println(String.format("El promedio del salon es %.2f", promedio));

		//

		// map filter reduce map(codigo).filter().

		System.out.println(Arrays.toString(notas));

		teclado.close();

	}

}
