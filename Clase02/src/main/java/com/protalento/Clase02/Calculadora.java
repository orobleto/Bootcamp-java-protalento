package com.protalento.Clase02;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/// decimales 5.6 8.96 0.2
		// variables
		double numeroA, numeroB;
		double total = 0;
		char operador;
		Scanner teclado = new Scanner(System.in);
		// pedimos los datos
		System.out.print("Ingrese un numero:");
		numeroA = teclado.nextDouble();

		System.out.print("Ingrese otro numero:");
		numeroB = teclado.nextDouble();

		System.out.print("Ingrese un operador [+, - , * , / , %]:");// s , r , p , d , m
		operador = teclado.next().charAt(0);
		// algoritmo de suma, resta, multiplicacion y division

		if (operador == '+' || operador == 's') {
			total = numeroA + numeroB;
		} else if (operador == '-' || operador == 'r') {
			total = numeroA - numeroB;
		} else if (operador == '*' || operador == 'p') {
			total = numeroA * numeroB;
		} else if (operador == '/' || operador == 'd') {
			if (numeroB == 0) {
				System.err.println("No se puede dividir por cero");
			} else {
				total = numeroA / numeroB;
			}
		} else if (operador == '%' || operador == 'm') {
			total = numeroA % numeroB;
		} else {
			System.err.println("Solo estan permitidos los caracteres [ +, - , * , / ]...");
		}

		System.out.println(numeroA + " " + operador + " " + numeroB + " = " + total);
		teclado.close();

	}
}
