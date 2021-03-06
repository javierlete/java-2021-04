<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<base href="${pageContext.request.contextPath}/" />

<title>Tienda Online</title>

<!-- FontAwesome -->
<link href="css/all.min.css" rel="stylesheet" />

<!-- Bootstrap CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
	
<!-- DataTables adaptado a Bootstrap -->
<link href="css/dataTables.bootstrap5.min.css" rel="stylesheet" />

<!-- Chart.js -->
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Tienda Online</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="principal">Principal</a></li>
					<c:if test="${sessionScope.usuario.rol == 'ADMIN' }">
						<li class="nav-item"><a class="nav-link"
							href="admin/productos/listado">Productos</a></li>
						<li class="nav-item"><a class="nav-link"
							href="admin/usuarios/listado">Usuarios</a></li>
					</c:if>
				</ul>
				<c:if test="${sessionScope.usuario != null}">
					<span class="navbar-text">${sessionScope.usuario.nombre}</span>
				</c:if>
				<ul class="navbar-nav mb-2 mb-lg-0">
					<c:choose>
						<c:when test="${sessionScope.usuario != null}">
							<li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
						</c:when>
						<c:otherwise>
							<li class="nav-item"><a class="nav-link" href="login">Login</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
	</nav>

	<main class="container">