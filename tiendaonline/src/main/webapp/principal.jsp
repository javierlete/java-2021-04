<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/includes/cabecera.jsp"%>

<h1>Bienvenido ${usuario.nombre}, tienes el rol ${usuario.rol}</h1>

<div
	class="row row-cols-1 row-cols-sm-2 row-cols-md-3 row-cols-lg-4 row-cols-xl-5 row-cols-xxl-6 g-4">

	<c:forEach items="${productos}" var="producto">

		<div class="col">
			<div class="card h-100">
				<img src="imgs/${producto.id}.png" class="card-img-top" alt="">
				<div class="card-body">
					<h5 class="card-title">${producto.nombre}</h5>
					<p class="card-text">${producto.nombre}</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">${producto.precio}</small>
				</div>
			</div>
		</div>
	</c:forEach>
</div>

<%@ include file="/includes/pie.jsp"%>
