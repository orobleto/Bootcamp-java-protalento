package com.protalento.Clase19;

import com.protalento.entidades.Calculos;
import com.protalento.interfaces.ICalculos;
import com.protalento.interfaces.IOperacion;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ICalculos calculos = new Calculos();

		System.out.println(calculos.sumar(5, 6));

		// clase anonima
		IOperacion iOperacionSumar = new IOperacion() {
			public int operar(int a, int b) {
				return a + b;
			}
		};

		IOperacion iOperacionRestar = new IOperacion() {
			public int operar(int a, int b) {
				return a - b;
			}
		};

		IOperacion iOperacionModulo = new IOperacion() {
			public int operar(int a, int b) {
				return a % b;
			}
		};

		IOperacion iOperacionMayor = new IOperacion() {
			public int operar(int a, int b) {
				return a > b ? a : b;
			}
		};

		// sentencia es la expresion minima
		IOperacion iOperacionFuncionaSumar = (a, b) -> a + b;

		;

	}
}
