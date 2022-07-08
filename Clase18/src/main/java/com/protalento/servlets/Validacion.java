package com.protalento.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.protalento.entidades.Usuario;

/**
 * Servlet implementation class Validacion
 */

@WebServlet("/validacion")
public class Validacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Validacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().invalidate();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String correo = request.getParameter("correo");
		String nombre = request.getParameter("nombre");
		String clave = request.getParameter("clave");

		Usuario usuario = new Usuario(nombre, correo, clave);

		System.out.println(usuario);

		request.setAttribute("usuarioRED", usuario);

		HttpSession sesion = request.getSession();
		sesion.setMaxInactiveInterval(60);
		sesion.setAttribute("saludo", "esto es una sesion " + nombre);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("bienvenido.jsp");
		requestDispatcher.forward(request, response);

	}

}
