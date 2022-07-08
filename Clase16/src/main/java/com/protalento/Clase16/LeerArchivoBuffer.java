package com.protalento.Clase16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class LeerArchivoBuffer {

	public static void main(String[] args) {
		leer("C:\\ArchivosJava\\Archivo01.txt");
		escribir("C:\\ArchivosJava\\Archivo01BW.txt", Arrays.asList("HTML", "CSS", "Java Script"));
	}

	static void leer(String ruta) {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ruta))) {
			String linea;

			while ((linea = bufferedReader.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e1) {

			e1.printStackTrace();
		}

	}

	static void escribir(String ruta, List<String> datos) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(ruta))) {
			for (String linea : datos) {
				bufferedWriter.write(linea);
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
