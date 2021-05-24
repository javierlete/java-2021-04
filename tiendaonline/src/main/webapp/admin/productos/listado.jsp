<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de productos</title>
</head>
<body>

	<h1>Listado de productos</h1>

	<table>
		<caption>Productos</caption>
		<thead>
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Precio</th>
				<th>Opciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${productos}" var="producto">
				<tr>
					<th>${producto.id}</th>
					<td>${producto.nombre}</td>
					<td>${producto.precio}</td>
					<td><a href="editar?id=${producto.id}">Editar</a> <a
						href="borrar?id=${producto.id}">Borrar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>
					<a href="agregar">Añadir</a>
				</td>
			</tr>
		</tfoot>
	</table>

</body>
</html>