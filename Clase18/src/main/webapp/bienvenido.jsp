<%@page import="com.protalento.entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
	Usuario usuario = (Usuario) request.getAttribute("usuarioRED");
	
	String saludo =(String) session.getAttribute("saludo");
	
	out.print(session.getId());
	%>

	<h1><%="Bienvenido " +usuario%></h1>
	<br>
	<h1><%=saludo%></h1>
</body>
</html>