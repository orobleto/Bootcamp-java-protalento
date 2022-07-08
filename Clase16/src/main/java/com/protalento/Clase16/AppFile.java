package com.protalento.Clase16;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class AppFile {
	public static void main(String[] args) throws IOException  {

		String ruta = "C:" + File.separator + "ArchivosJava";
		File file = new File(ruta);
		System.out.println(file.getName());
		listarHijos(file);

		File nuevoArchivo = new File("C:" + File.separator + "ArchivosJava" + File.separator + "prueba.txt");
		nuevoArchivo.createNewFile();
		
		File nuevoDirectorio = new File("C:" + File.separator + "ArchivosJava" + File.separator + "prueba");
		nuevoDirectorio.mkdir();
	}

	static void listarHijos(File directorio) {
		for (File hijo : directorio.listFiles()) {

			System.out.println((hijo.isDirectory() ? "Directorio: " : "Archivo: ") + hijo.getAbsolutePath());
			if (hijo.isDirectory()) {
				listarHijos(hijo);
			}
		}
	}

}
