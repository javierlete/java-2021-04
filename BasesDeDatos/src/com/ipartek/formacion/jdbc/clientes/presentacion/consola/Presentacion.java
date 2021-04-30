package com.ipartek.formacion.jdbc.clientes.presentacion.consola;

import java.util.ArrayList;

import com.ipartek.formacion.jdbc.clientes.entidades.Cliente;
import com.ipartek.formacion.jdbc.clientes.accesodatos.AccesoDatosException;
import com.ipartek.formacion.jdbc.clientes.accesodatos.DaoCliente;

public class Presentacion {

	public static void main(String[] args) {
		try {
			Cliente cliente = DaoCliente.obtenerPorId(2);

			System.out.println(cliente);
			System.out.println(cliente.getNombre());

			mostrarTodos();
			
			cliente = DaoCliente.insertar(new Cliente(null, "Juanes", "Teban"));

			System.out.println("INSERTADO -> " + cliente);
			
			mostrarTodos();
			
			DaoCliente.modificar(new Cliente(cliente.getId(), "Modificado", "Modificadez"));
			
			mostrarTodos();
			
			DaoCliente.borrar(cliente.getId());
			
			mostrarTodos();
		} catch(AccesoDatosException ade) {
			System.out.println("Ha habido un error accediendo a la base de datos");
			System.out.println(ade.getMessage());
			
			if(ade.getCause()!=null) {
				System.out.println(ade.getCause().getMessage());
			}
		} catch (Exception e) {
			System.out.println("Error no esperado");
			System.out.println(e.getMessage());
		}
	}

	private static void mostrarTodos() {
		ArrayList<Cliente> clientes = DaoCliente.obtenerTodos();

		System.out.println("MOSTRANDO TODOS");

		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
