<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/includes/cabecera.jsp"%>

<form action="login" method="post">
	<div class="row mb-3">
		<label for="email" class="col-sm-2 col-form-label">Email</label>
		<div class="col-sm-10">
			<input type="email" class="form-control" id="email" name="email">
		</div>
	</div>
	<div class="row mb-3">
		<label for="password" class="col-sm-2 col-form-label">Password</label>
		<div class="col-sm-10">
			<div class="input-group">
				<input type="password" class="form-control" id="password"
					name="password"> <span class="far fa-eye input-group-text"
					id="togglePassword"></span>
			</div>
		</div>
	</div>
	<div class="row mb-3">
		<button type="submit" class="btn btn-primary">Login</button>
		<p>${error}</p>
	</div>
</form>

<%@ include file="/includes/pie.jsp"%>
