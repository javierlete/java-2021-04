<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/includes/cabecera.jspf"%>

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
				<td>
					<a href="editar?id=${producto.id}">Modificar</a>
					<a href="borrar?id=${producto.id}">Borrar</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
	<tfoot>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>
				<a href="editar">Añadir</a>
			</td>
		</tr>
	</tfoot>
</table>

<%@ include file="/includes/pie.jspf"%>