<%@page import="com.protalento.entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hola Mundo</title>
</head>
<body>
	<h1>Primer Ciclo</h1>


<%!

private int contador = 0;
private Usuario usuario;
public String break_(){
	return "<br>";
}

%>

	<!-- Comentario HTML -->

	<%
	out.print("<br>");
	for(int i = 0; i<5;i++){
		out.print(i+1);
		out.print(break_());// .InnerText
	}
	

	%>

	<h1>Otro Ciclo</h1>

	<%  
	int inicio = 0;
	
	while(inicio<5){
	
	%>
	<!-- Mucho codigo HTML -->
	<h2><%=(inicio+1)%></h2>
	<br>

	<%	
	inicio++;
	}
%>


</body>
</html>