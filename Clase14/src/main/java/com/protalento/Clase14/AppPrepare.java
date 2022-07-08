package com.protalento.Clase14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AppPrepare {
	public static void main(String[] args) {

		Connection conexion = getConexion();
		try {
			System.out.println(conexion.getCatalog());
			System.out.println(conexion.isClosed());

			// System.out.println(insertar(conexion, "user3@educaionit.com", "98752365"));
			// seleccionar(conexion, "user3@educaionit.com");

			String correo = JOptionPane.showInputDialog("Indica el correo del usuario:");
			seleccionar(conexion, correo);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static Connection getConexion() {
		Connection conexion = null;
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/protalento";
		String usuario = "root";
		String clave = "";
		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, usuario, clave);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexion;
	}

	public static boolean insertar(Connection conexion, String correo, String clave) {
		String sql = "insert into usuarios (correo,clave) values(?,?);";
		try {
			PreparedStatement sentenciaPreparada = conexion.prepareStatement(sql);
			sentenciaPreparada.setString(1, correo);
			sentenciaPreparada.setString(2, clave);
			// 1 si la instruccion afecto uno o varios registros
			return sentenciaPreparada.executeUpdate() == 1;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void seleccionar(Connection conexion, String correo) {
		String sql = "select correo, clave from usuarios where correo = ?";
		try {
			PreparedStatement sentenciaPreparada = conexion.prepareStatement(sql);
			sentenciaPreparada.setString(1, correo);

			System.out.println(sentenciaPreparada);

			ResultSet resultado = sentenciaPreparada.executeQuery();

			while (resultado.next()) {
				System.out.println("Correo: " + resultado.getString("correo"));
				System.out.println("Clave:" + resultado.getString("clave"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
