<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/includes/cabecera.jsp" %>
	
<form action="login" method="post">
	<div>
		<label for="email">Email</label>
		<input type="email" id="email" name="email" />
	</div>
	<div>
		<label for="password">Password</label>
		<input type="password" id="password" name="password" />
	</div>
	<div>
		<button>Aceptar</button>
		<p>${error}</p>
	</div>
</form>

<%@ include file="/includes/pie.jsp" %>	