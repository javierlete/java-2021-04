<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora</title>
</head>
<body>

	<form>
		<input type="number" name="op1" placeholder="Primer operando" />
		<select name="op">
			<option>+</option>
			<option>-</option>
			<option>x</option>
			<option>/</option>
		</select>
		<input type="number" name="op2" placeholder="Segundo operando" />
		<button>=</button>
	</form>

<%
	String strOp1 = request.getParameter("op1");
	String op = request.getParameter("op");
	String strOp2 = request.getParameter("op2");
	
	if(strOp1 != null && op != null && strOp2 != null) {
		
		int op1 = Integer.parseInt(strOp1);
		int op2 = Integer.parseInt(strOp2);
		
		switch(op) {
		case "+":
			out.println(op1 + op2);
			break;
		case "-":
			out.println(op1 - op2);
			break;
		case "x":
			out.println(op1 * op2);
			break;
		case "/":
			out.println(op1 / op2);
			break;
		}
	}
%>

</body>
</html>