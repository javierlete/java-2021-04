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
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${productos}" var="producto">
			<tr>
				<th>${producto.id}</th>
				<td>${producto.nombre}</td>
				<td>${producto.precio}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<%@ include file="/includes/pie.jspf"%>