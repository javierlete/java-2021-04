<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hola Mundo MVC</title>
</head>
<body>

	<a href="holamvc">Vínculo</a>
	
	<form action="holamvc">
		<button>Formulario GET</button>
	</form>
	
	<form action="holamvc" method="post">
		<input name="nombre">
		<button>Aceptar</button>
	</form>
	
	<h1>${saludo}</h1>

</body>
</html>