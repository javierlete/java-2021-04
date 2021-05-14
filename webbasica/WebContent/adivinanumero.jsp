<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adivina el número</title>
</head>
<body>

<form action="adivinanumero">
	<input type="number" name="numero" 
		placeholder="Introduce un número entre 1 y 100" />
	<button>Aceptar</button>
	
	<p>
		${respuesta} <!-- ${cookie.adivinar.value} -->
	</p>	
</form>

</body>
</html>