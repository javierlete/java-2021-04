<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/includes/cabecera.jsp"%>
<h1>Listado de productos</h1>
<div class="table-responsive">
	<table class="table table-striped table-hover table-bordered table-sm">
		<caption>Productos</caption>
		<thead class="table-dark">
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
					<td><a class="btn btn-primary"
						href="admin/productos/editar?id=${producto.id}">Editar</a> <a
						class="btn btn-danger" data-bs-toggle="modal"
						data-bs-target="#estas-seguro"
						href="admin/productos/borrar?id=${producto.id}">Borrar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td><a class="btn btn-primary" href="admin/productos/editar">Añadir</a></td>
			</tr>
		</tfoot>
	</table>
</div>

<!-- Modal -->
<div class="modal fade" id="estas-seguro" data-bs-backdrop="static"
	data-bs-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="staticBackdropLabel">¿Estás seguro?</h5>
				<button type="button" class="btn-close" data-bs-dismiss="modal"
					aria-label="Close"></button>
			</div>
			<div class="modal-body">Vas a borrar un registro de forma
				irrecuperable</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary"
					data-bs-dismiss="modal">No gracias</button>
				<a href="#" type="button" class="btn btn-danger">Sí por favor</a>
			</div>
		</div>
	</div>
</div>

<script>
	// Obtenemos el elemento cuyo id es estas-seguro
	var estasSeguro = document.getElementById('estas-seguro')
	// Escuchamos el evento de que se ha disparado el modal sobre el elemento anterior
	estasSeguro.addEventListener('show.bs.modal', function(event) {
		// Recogemos el enlace que ha disparado el modal
		var enlace = event.relatedTarget
		// Recogemos el valor del href que hemos pasado en la tabla
		var href = enlace.getAttribute('href')
		// Dentro del modal buscamos el enlace de "sí quiero"
		var a = estasSeguro.querySelector('.modal-footer a')
		// Modificamos el enlace para que nos lleve al borrado del id que hemos leido
		a.href = href;
	})
</script>
<%@ include file="/includes/pie.jsp"%>