package com.protalento.Clase16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirLeerObjetosJava {
	public static void main(String[] args) {

		try (DataOutputStream dataOutputStream = new DataOutputStream(
				new FileOutputStream("C:\\ArchivosJava\\DOS01.txt"))) {

			dataOutputStream.writeUTF("protalento");
			dataOutputStream.writeInt(2022);
			dataOutputStream.writeFloat(6.3f);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (DataInputStream dataInputStream = new DataInputStream(
				new FileInputStream("C:\\ArchivosJava\\DOS01.txt"))) {
			String curso = dataInputStream.readUTF();
			String anio = dataInputStream.readUTF();
			Float nota = dataInputStream.readFloat();

			System.out.println(curso + " " + anio + " " + nota);

		} catch (Exception e) {

		}

	}
}
