<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookies</title>

<style>
	.claro {
		color: black;
		background: white;
	}
	.oscuro {
		color: white;
		background: black;
	}
	.colores {
		color: blue;
		background: pink;
	}
</style>

</head>
<body class="${temaguardado}">
	<form action="cookies">
		<select name="tema">
			<option value="claro">Claro</option>
			<option value="oscuro">Oscuro</option>
			<option value="colores">Colores</option>
		</select>
		<button>Aceptar</button>
		<pre>
			Cookie: ${cookie.temacookie.value} 
			Parámetro: ${param.tema}
		</pre>
	</form>
</body>
</html>