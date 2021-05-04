package com.ipartek.formacion.supermercado.presentacionconsola;

import com.ipartek.formacion.supermercado.accesodatos.DaoUsuario;
import com.ipartek.formacion.supermercado.entidades.Usuario;

public class PresentacionConsola {

	public static void main(String[] args) {
		for(Usuario usuario: DaoUsuario.obtenerTodos()) {
			System.out.println(usuario);
		}
		
		Usuario u = DaoUsuario.obtenerPorId(1);
		System.out.println(u);
	}

}
