package com.ipartek.formacion.webbasica;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculadoracerebro")
public class CalculadoraCerebro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("calculadoramvc.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strOp1 = request.getParameter("op1");
		String op = request.getParameter("op");
		String strOp2 = request.getParameter("op2");

		String resultado = "";

		if (strOp1 != null && op != null && strOp2 != null) {
			try {
				int op1 = Integer.parseInt(strOp1);
				int op2 = Integer.parseInt(strOp2);

				switch (op) {
				case "+":
					resultado = String.valueOf(op1 + op2);
					break;
				case "-":
					resultado = String.valueOf(op1 - op2);
					break;
				case "x":
					resultado = String.valueOf(op1 * op2);
					break;
				case "/":
					resultado = String.valueOf(op1 / op2);
					break;
				}
			} catch (Exception e) {
				resultado = "Intenta usar números la próxima vez";
			}
			
			request.setAttribute("res", resultado);
			
			request.getRequestDispatcher("calculadoramvc.jsp").forward(request, response);
		}
	}

}
