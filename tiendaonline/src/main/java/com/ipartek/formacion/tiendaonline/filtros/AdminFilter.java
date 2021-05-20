package com.ipartek.formacion.tiendaonline.filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ipartek.formacion.tiendaonline.modelos.Usuario;

@WebFilter("/admin/*")
public class AdminFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		HttpSession session = req.getSession();
		Usuario usuario = (Usuario) session.getAttribute("usuario");
		
		if(usuario != null && usuario.getRol().equals("ADMIN")) {
			chain.doFilter(request, response);
		} else {
			req.setAttribute("error", "El usuario no tiene permiso para acceder");
			//res.sendRedirect(req.getContextPath() + "/login");
			req.getRequestDispatcher("/login").forward(req, res);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {}

	public void destroy() {}
}
