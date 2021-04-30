package com.ipartek.formacion.jdbc.clientes.presentacion.consola;

import java.util.ArrayList;

import com.ipartek.formacion.jdbc.clientes.entidades.Cliente;

import com.ipartek.formacion.jdbc.clientes.accesodatos.DaoCliente;

public class Presentacion {

	public static void main(String[] args) {
		Cliente cliente = DaoCliente.obtenerPorId(2);

		System.out.println(cliente);

		mostrarTodos();
		
		cliente = DaoCliente.insertar(new Cliente(null, "Juanes", "Teban"));

		System.out.println("INSERTADO -> " + cliente);
		
		mostrarTodos();
		
		DaoCliente.modificar(new Cliente(cliente.getId(), "Modificado", "Modificadez"));
		
		mostrarTodos();
		
		DaoCliente.borrar(cliente.getId());
		
		mostrarTodos();
	}

	private static void mostrarTodos() {
		ArrayList<Cliente> clientes = DaoCliente.obtenerTodos();

		System.out.println("MOSTRANDO TODOS");

		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
