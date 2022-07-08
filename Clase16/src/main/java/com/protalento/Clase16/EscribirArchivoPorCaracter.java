package com.protalento.Clase16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EscribirArchivoPorCaracter {
	public static void main(String[] args) {
		//FileWriter
		try (FileOutputStream fichero = new FileOutputStream("C:\\ArchivosJava\\Archivo05.txt",false)) {
			List<String> cursos = Arrays.asList("Java SE\n", "SQL Server\n", "JS\n", "HTML\n");

			for (String curso : cursos) {
				for (int i = 0; i < curso.length(); i++) {
					fichero.write(curso.charAt(i));
				}
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e1) {

			e1.printStackTrace();
		}
	}
}
