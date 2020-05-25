<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${titulo}</title>
</head>
<body>
	<h1>${titulo}</h1>
	<p>${contenido}</p>
	<ul>
		<c:forEach items="${notas}" var="nota">
			<li>
				<h3>${nota.getTitulo()}</h3>
			</li>
			<p>${nota.getContenido()}</p>
		</c:forEach>
	</ul>
	
</body>
</html>