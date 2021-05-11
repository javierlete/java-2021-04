<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora MVC</title>
</head>
<body>
	<form action="calculadoracerebro" method="post">
		<input type="number" name="op1" placeholder="Primer operando"
			value="${param.op1}" /> <select name="op">
			<option ${param.op == '+' ? 'selected' : '' }>+</option>
			<option ${param.op == '-' ? 'selected' : '' }>-</option>
			<option ${param.op == 'x' ? 'selected' : '' }>x</option>
			<option ${param.op == '/' ? 'selected' : '' }>/</option>
		</select> <input type="number" name="op2" placeholder="Segundo operando"
			value="${param.op2}" />
		<button>=</button>
	</form>
	
	${res}
</body>
</html>