package com.protalento.Clase04;

import java.util.Arrays;

public class Utilidades {
	public static void main(String[] args) {
		String[] nombres = new String[3];
		int[] anios = new int[3];
		char[] caracteres = new char[3];
		double[] sueldos = new double[3];
		boolean[] verdades = new boolean[3];

		System.out.println(Arrays.toString(nombres));
		System.out.println(Arrays.toString(anios));
		System.out.println(Arrays.toString(caracteres));
		System.out.println(Arrays.toString(sueldos));
		System.out.println(Arrays.toString(verdades));
		
		System.out.println((int) ' ');
		
		
		String[] diasSemana = { "Lun", "Mar", "Mie", "Jue", "Vie", "Sab", "Dom" };
		System.out.println(Arrays.toString(diasSemana));
		// Arrays.sort(diasSemana);
		System.out.println(Arrays.toString(diasSemana));
		
		String[] diasHabiles = Arrays.copyOf(diasSemana, 5);
		System.out.println(Arrays.toString(diasHabiles));
		String[] finSemana = Arrays.copyOfRange(diasSemana, 5, 7);
		System.out.println(Arrays.toString(finSemana));
		
		String[] diasHabiles2 = diasHabiles;
		
		System.out.println(Arrays.toString(diasHabiles2));
		diasHabiles[0] = "Lunes";
		
		System.out.println(Arrays.toString(diasHabiles2));
		
		String[][] matriz;
		
		
		
		
	}
}
