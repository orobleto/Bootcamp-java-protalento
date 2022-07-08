package com.protalento.Clase16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerArchivoPorCaracter {
	public static void main(String[] args) {
		//esto mas para cuando no necesitamos leer 
		// FileWriter
		try (FileInputStream fichero = new FileInputStream("C:\\ArchivosJava\\Archivo01.txt")) {

			byte[] caracteres = fichero.readAllBytes();
			
			for (int i = 0; i < caracteres.length; i++) {
				System.out.print((char) caracteres[i]);
			}
			
			/*
			int ascii;

			while ((ascii = fichero.read()) != -1) {
				System.out.print((char) ascii);
			}*/

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
