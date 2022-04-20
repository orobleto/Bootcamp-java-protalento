package com.protalento.Clase09;

import java.util.Date;
import java.util.Scanner;

public class App4 {
	public static void main(String[] args) {

		try (FechaPrueba fecha = new FechaPrueba("2022-06-06")) {
		
			fecha.setFecha(new Date(123, 0, 1));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
