package com.ipartek.formacion.clientesspring.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ipartek.formacion.clientesspring.entidades.Cliente;
import com.ipartek.formacion.clientesspring.servicios.ClienteService;

@Controller
public class ClientesController {
	@Autowired
	private ClienteService servicio;
	
	@GetMapping("/")
	public String listado(Model modelo) {
		modelo.addAttribute("clientes", servicio.listar());
		return "listado";
	}
	
	@GetMapping("/cliente/{id}")
	public String mostrar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("cliente", servicio.obtenerPorId(id));
		return "cliente";
	}
	
	@GetMapping("/cliente/borrar/{id}")
	public String borrar(@PathVariable Long id) {
		servicio.eliminar(id);
		return "redirect:/";
	}
	
	@PostMapping("/cliente")
	public String editar(Cliente cliente) {
		servicio.editar(cliente);
		return "redirect:/";
	}
}
