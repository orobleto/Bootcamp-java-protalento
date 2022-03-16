package com.protalento.Clase02;

import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {
		/// decimales 5.6 8.96 0.2
		// variables
		System.out.println("Switch");
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

		// numeros enteros , caracteres , string y los enumerador
		switch (operador) {
		case 's':
		case 'S':
		case '+':
			total = numeroA + numeroB;
			break;
		case 'R':
		case 'r':
		case '-':
			total = numeroA - numeroB;
			break;
		case 'P':
		case 'p':
		case '*':
			total = numeroA * numeroB;
			break;
		case 'd':
		case 'D':
		case '/':
			if (numeroB == 0) {
				System.err.println("No se puede dividir por cero");
			} else {
				total = numeroA / numeroB;
			}
			break;
		case 'm':
		case 'M':
		case '%':
			total = numeroA % numeroB;
			break;
		default:
			System.err.println("Caracter invalido");

		}

		System.out.println(numeroA + " " + operador + " " + numeroB + " = " + total);
		teclado.close();
	}

}
