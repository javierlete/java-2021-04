<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/includes/cabecera.jsp"%>
<h1>Edición de producto</h1>

<form action="admin/productos/editar" method="post">
	<div class="row mb-3">
		<label for="id" class="col-sm-2 col-form-label">Id</label>
		<div class="col-sm-10">
			<input type="number" readonly class="form-control" id="id" name="id"
				value="${producto.id}">
		</div>
	</div>
	<div class="row mb-3">
		<label for="nombre" class="col-sm-2 col-form-label">Nombre</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="nombre" name="nombre"
				value="${producto.nombre}">
		</div>
	</div>
	<div class="row mb-3">
		<label for="precio" class="col-sm-2 col-form-label">Precio</label>
		<div class="col-sm-10">
			<input type="number" step=".01" id="precio" name="precio"
				value="${producto.precio}" class="form-control">
		</div>
	</div>
	<button type="submit" class="btn btn-primary">Aceptar</button>
</form>

<%@ include file="/includes/pie.jsp"%>