<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nueva nota</title>
<link href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<br>
		<h3>Crear nota</h3>
		<form action="nuevo" method="post">
			<input type="hidden" name="id" value="0" class="form-control"/>
			<input type="text" name="titulo" placeholder="Titulo de la nota"/>
			<br>
			<br>
			<textarea rows="5" cols="100" name="contenido" placeholder="Ingrese el contenido de su nota" class="form-control"></textarea>
			<br>
			<button type="submit" class="btn btn-secondary">Enviar</button>
		</form>
	</div>
	<br>
	<br>
	<div class="container">
		<div class="card" >
		<div class="card-header"> ${nota.getTitulo()}</div>
		<div class="card-body">
			${ nota.getContenido()}
		</div>
	</div>
	
</body>
</html>