package com.protalento.Clase14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Inicio");

		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/protalento";
		String usuario = "root";
		String clave = "";

		try (Connection conexion = DriverManager.getConnection(url, usuario, clave)) {

			// insertar
			Statement sentenciaInsertar = conexion.createStatement();
			String queryInsertar = "insert into usuarios (correo,clave) values ('user25@gmail.com','1234');";
			sentenciaInsertar.execute(queryInsertar);

			// actualizar
			Statement sentenciaActualizar = conexion.createStatement();
			String queryActualizar = "update usuarios set clave = '4567' where correo = 'user1@gmail.com';";
			sentenciaActualizar.execute(queryActualizar);

			// borrado
			Statement sentenciaBorrado = conexion.createStatement();
			String queryBorrado = "delete from usuarios where correo = 'user2@gmail.com';";
			sentenciaBorrado.execute(queryBorrado);

			// seleccionar
			String correo = JOptionPane.showInputDialog("Indica el correo del usuario:");

			Statement sentenciaSeleccionar = conexion.createStatement();
			String querySeleccionar = "select correo , clave from usuarios where correo = '" + correo + "';";
			System.out.println(querySeleccionar);
			ResultSet resultado = sentenciaSeleccionar.executeQuery(querySeleccionar);

			while (resultado.next()) {
				System.out.println("Parametro Numerico: " + resultado.getString(1) + "  -  " + resultado.getString(2));
				System.out.println("Parametro Caracter: " + resultado.getString("correo") + "  -  "
						+ resultado.getString("clave"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Fin");

	}
}
