package com.protalento.Clase16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LeerEscribirObjetosPropios {
	public static void main(String[] args) {
		String ruta = "C:\\ArchivosJava\\usuarios.txt";

		Usuario usuario1 = new Usuario(1, "user1");
		Usuario usuario2 = new Usuario(2, "user2");
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ruta))) {

			objectOutputStream.writeObject(usuario1);
			objectOutputStream.writeObject(usuario2);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ruta))) {
			Usuario user1 = (Usuario) objectInputStream.readObject();
			Usuario user2 = (Usuario) objectInputStream.readObject();

			System.out.println(user1);
			System.out.println(user2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
