package com.protalento.Clase03;

import java.util.Scanner;

public class Advinar {

	public static void main(String[] args) {
		// generar un numero aleatorio entre 1 y 10 y que el usuario lo adivine
		// declarar variables

		int numeroAleatorio;
		int numeroUsuario;
		// boolean adivino = false;
		int cantidadIntentos = 0;
		Scanner teclado = new Scanner(System.in);

		// generar numero aleatorio
		
		double aleatorio = Math.random(); 
		System.out.println(aleatorio);
		numeroAleatorio = (int) ((aleatorio *  10 ) + 1);// 0   --   X IP: 0-255.0-255.0-255.0-255 0.999999 254.99999
		System.out.println(numeroAleatorio);

		System.out.println("Bienvenido a ADVINA UN NUMERO protalento");

		// desea jugar

		do { // !false

			System.out.print("Ingresa un numero: ");
			numeroUsuario = teclado.nextInt();
			cantidadIntentos++;

			if (numeroAleatorio > numeroUsuario) {
				System.out.println("Intenta un numero mayor.");
			} else if (numeroAleatorio < numeroUsuario) {
				System.out.println("Intenta un numero menor.");
			} else {
				break;// break;// adivino = true;
			}

			// oriente al usuario
		} while (true); // while (!adivino);

		System.out.println("Felicidades lo lograste en " + cantidadIntentos
				+ (cantidadIntentos == 1 ? " intento" : " intentos") + ", te ganaste un examen en educacion IT");
		teclado.close();
		// algoritmo del juego

	}

}
