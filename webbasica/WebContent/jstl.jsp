<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplos de JSTL</title>
</head>
<body>

	<c:if test="${param.nombre == 'Javier'}">
		<h1>Hombre, el profesor</h1>
	</c:if>

	<c:choose>
		<c:when test="${param.dato == 1}">Uno</c:when>
		<c:when test="${param.dato == 2}">Dos</c:when>
		<c:when test="${param.dato == 3}">Tres</c:when>
		<c:otherwise>Otro</c:otherwise>
	</c:choose>

	<ul>
		<c:forEach items="${arr}" var="texto">
			<li>${texto}</li>
		</c:forEach>
	</ul>

	<ul>
		<c:forEach items="${textos}" var="texto">
			<li>${texto}</li>
		</c:forEach>
	</ul>
	
	<p>
		<c:forEach begin="1" end="10" step="2" var="contador">${contador} </c:forEach>
	</p>

	<form>
		<input name="nombre" placeholder="Nombre" /> <input type="number"
			name="dato" placeholder="numero" />
		<button>Aceptar</button>
	</form>

</body>
</html>