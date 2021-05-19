<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

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

</body>
</html>