<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/includes/cabecera.jspf"%>

<form action="editar" method="post">
	<div>
		<label for="id">Id</label>
		<input type="number" id="id" name="id" value="${producto.id}" />
	</div>
	<div>
		<label for="nombre">Nombre</label>
		<input id="nombre" name="nombre" value="${producto.nombre}" />
	</div>
	<div>
		<label for="precio">Precio</label>
		<input type="number" step=".01" id="precio" name="precio" value="${producto.precio}" />
	</div>
	<div>
		<button>Aceptar</button>
	</div>
</form>

<%@ include file="/includes/pie.jspf"%>