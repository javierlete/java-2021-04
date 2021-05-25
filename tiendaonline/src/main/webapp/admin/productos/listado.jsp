<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/includes/cabecera.jsp" %>
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
					<td><a href="admin/productos/editar?id=${producto.id}">Editar</a> <a
						href="admin/productos/borrar?id=${producto.id}">Borrar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>
					<a href="admin/productos/editar">Añadir</a>
				</td>
			</tr>
		</tfoot>
	</table>

<%@ include file="/includes/pie.jsp" %>