<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="/includes/cabecera.jspf" %>

	<form action="login" method="post">
		<div>
			<label for="email">Email</label>
			<input id="email" type="email" name="email" />
		</div>
		<div>
			<label for="password">Contraseña</label>
			<input id="password" type="password" name="password" />
		</div>
		<div>
			<button>Login</button>
			<p>${error}</p>
		</div>
	</form>
<%@ include file="/includes/pie.jspf" %>