package com.protalento.Clase05;

public class Principal {
	public static void main(String[] args) {
		Calculos calculos = new Calculos();
		System.out.println(calculos.suma(5, 8, 9));
		byte num1 = 5;
		byte num2 = 6;
		System.out.println(calculos.suma(num1, num2));// 45

		System.out.println(calculos.suma((byte) 5, (byte) 6));

		System.out.println(calculos.suma(5d, 6d));
	}
}
