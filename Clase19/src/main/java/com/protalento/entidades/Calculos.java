package com.protalento.entidades;

import com.protalento.interfaces.ICalculos;

public final class Calculos implements ICalculos {

	public int sumar(int a, int b) {
		return a + b;
	}

	public int restar(int a, int b) {
		return a - b;
	}

	public int multiplicar(int n, int h) {
		return n * h;
	}

	public int dividir(int a, int b) {
		return b == 0 ? 0 : a / b;
	}

}
