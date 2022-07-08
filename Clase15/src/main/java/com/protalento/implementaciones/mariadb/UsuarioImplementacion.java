package com.protalento.implementaciones.mariadb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.protalento.entidades.Usuario;
import com.protalento.interfaces.ConexionMariaDB;
import com.protalento.interfaces.DAO;

public class UsuarioImplementacion implements DAO<Usuario, Long>, ConexionMariaDB {
	private PreparedStatement preparedStatementBuscarPorID;
	private PreparedStatement preparedStatementEliminar;
	private PreparedStatement preparedStatementModificar;
	private PreparedStatement preparedStatementInsertar;
	private PreparedStatement preparedStatementListar;

	@Override
	public Usuario buscarPorId(Long id) {
		Usuario usuario = null;
		String sql = "select correo,aes_decrypt(clave,?) as clave, fechaModificacion from usuarios where id = ?";
		try {

			if (preparedStatementBuscarPorID == null) {
				preparedStatementBuscarPorID = getConexion().prepareStatement(sql);
			}

			preparedStatementBuscarPorID.setString(1, KEY);
			preparedStatementBuscarPorID.setLong(2, id);

			ResultSet resultSet = preparedStatementBuscarPorID.executeQuery();

			if (resultSet.next()) {
				usuario = new Usuario();
				usuario.setCorreo(resultSet.getString("correo"));
				usuario.setClave(resultSet.getString("clave"));
				usuario.setFechaModificacion(LocalDateTime.parse(resultSet.getString("fechaModificacion"),
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}

	@Override
	public boolean insertar(Usuario usuario) {
		// nos aseguramos que no de Exception in thread "main"
		// java.lang.NullPointerException
		if (usuario == null) {
			return false;
		}

		String sql = "insert into usuarios (correo,clave,fechaModificacion) values (?,aes_encrypt(?,?),?)";

		try {
			if (preparedStatementInsertar == null) {
				preparedStatementInsertar = getConexion().prepareStatement(sql,
						PreparedStatement.RETURN_GENERATED_KEYS);
			}

			preparedStatementInsertar.setString(1, usuario.getCorreo());
			preparedStatementInsertar.setString(2, usuario.getClave());
			preparedStatementInsertar.setString(3, KEY);
			preparedStatementInsertar.setString(4,
					usuario.getFechaModificacion().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

			boolean inserto = preparedStatementInsertar.executeUpdate() == 1;

			ResultSet resultSet = preparedStatementInsertar.getGeneratedKeys();

			if (resultSet.next()) {
				usuario.setId(resultSet.getLong(1));
			}

			return inserto;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean modificar(Usuario usuario) {
		// nos aseguramos que no de Exception in thread "main"
		// java.lang.NullPointerException
		if (usuario == null) {
			return false;
		}

		String sql = "update usuarios set clave = aes_encrypt(?,?) where correo = ?";
		try {
			if (preparedStatementModificar == null) {
				preparedStatementModificar = getConexion().prepareStatement(sql);
			}
			preparedStatementModificar.setString(1, usuario.getClave());
			preparedStatementModificar.setString(2, KEY);
			preparedStatementModificar.setString(3, usuario.getCorreo());

			return preparedStatementModificar.executeUpdate() == 1;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean eliminar(Usuario usuario) {
		// nos aseguramos que no de Exception in thread "main"
		// java.lang.NullPointerException
		if (usuario == null) {
			return false;
		}

		String sql = "delete from usuarios where correo = ?";
		try {
			if (preparedStatementEliminar == null) {
				preparedStatementEliminar = getConexion().prepareStatement(sql);
			}
			preparedStatementEliminar.setString(1, usuario.getCorreo());

			return preparedStatementEliminar.executeUpdate() == 1;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Usuario> listar() {
		List<Usuario> usuarios = new ArrayList<>();

		String sql = "select correo, aes_decrypt(clave,?) as clave from usuarios";
		try {
			if (preparedStatementListar == null) {
				preparedStatementListar = getConexion().prepareStatement(sql);
			}
			preparedStatementListar.setString(1, KEY);

			ResultSet resultSet = preparedStatementListar.executeQuery();

			while (resultSet.next()) {
				Usuario usuario = new Usuario();
				usuario.setCorreo(resultSet.getString("correo"));
				usuario.setClave(resultSet.getString("clave"));
				usuarios.add(usuario);
				/*
				 * String correo = resultSet.getString("correo"); String clave
				 * =resultSet.getString("clave") ;
				 * 
				 * usuarios.add(new Usuario(correo, clave));
				 */

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuarios;
	}

}
