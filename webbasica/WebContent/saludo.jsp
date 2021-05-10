<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Saludo</title>
</head>
<body>

	<h1>Hola <%= request.getParameter("nombre") %></h1>
	<h1>Hola ${param.nombre}</h1>
	<h1>${param.contra}</h1>
	<h1>${param.opcion}</h1>
	
	<form method="post">
		<input name="nombre" />
		<input type="password" name="contra" />
		<select name="opcion">
			<option value="1">Uno</option>
			<option value="2">Dos</option>
		</select>
		<button>Saludar</button>
	</form>
</body>
</html>