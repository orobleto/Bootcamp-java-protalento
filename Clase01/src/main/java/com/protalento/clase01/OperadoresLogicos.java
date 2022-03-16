package com.protalento.clase01;

public class OperadoresLogicos {
	public static void main(String[] args) {
		//
		String cabello = "rojo";
		String diaSemana = "jueves";
		boolean adivino = false;
		

		System.out.println((!(cabello == "rojo") || diaSemana.equals("jueves")));

	}

}
