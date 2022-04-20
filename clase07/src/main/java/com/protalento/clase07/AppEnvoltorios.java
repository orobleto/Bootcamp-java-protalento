package com.protalento.clase07;

import java.util.Arrays;

public class AppEnvoltorios {
	public static void main(String[] args) {
		Integer[] numeros = new Integer[5];

		System.out.println(Arrays.toString(numeros));
		
		
		int numeroentero = 5;
		Integer numeroInteger = 10;
		
		numeroentero =  numeroInteger.intValue();
		
		numeroentero = Integer.valueOf("5");
		Integer.parseInt("2");
		Double doble;
		Boolean booleaano =Boolean.valueOf("1");
		System.out.println(booleaano);
		
		
		
		
	}
}
