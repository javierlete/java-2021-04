<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/includes/cabecera.jsp"%>

<h1>Listado de usuarios</h1>

<div class="table-responsive">
	<table class="table table-striped table-hover table-bordered table-sm">
		<caption>Usuarios</caption>
		<thead class="table-dark">
			<tr>
				<th>Id</th>
				<th>Email</th>
				<th>Password</th>
				<th>Nombre</th>
				<th>Rol</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${usuarios}" var="usuario">
				<tr>
					<th>${usuario.id}</th>
					<td>${usuario.email}</td>
					<td>${usuario.password}</td>
					<td>${usuario.nombre}</td>
					<td>${usuario.rol}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<%@ include file="/includes/pie.jsp"%>